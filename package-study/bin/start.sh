#!/bin/sh

# 设置 springboot 启动的 jar 包
JAR_NAME="package-study.jar"

# logback 配置文件名称
LOGBACK_XML_NAME="logback-spring"

# 设置 jvm 配置信息
JAVA_OPT="-server -Xms1g -Xmx1g -Xmn512m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m"

# 设置 gc 日志相关
JAVA_OPT="${JAVA_OPT} -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=${BASE_DIR}/logs/java_heapdump.hprof"

#
# 只需要考虑修改以上参数就行
#

# 判断是否配置 JAVA_HOME
if [ -z "${JAVA_HOME}" ]; then
    echo "please set JAVA_HOME";
    exit 1;
fi

# 设置执行的 java 路径
export JAVA="${JAVA_HOME}/bin/java"

# 设置项目的根路径
export BASE_DIR=`cd $(dirname $0)/..; pwd`

# 设置配置文件位置,并且自定义自己的配置文件位置
DEFAULT_SEARCH_LOCATIONS="classpath:/,classpath:/config/,file:./,file:./config/"
CUSTOM_SEARCH_LOCATIONS=${DEFAULT_SEARCH_LOCATIONS},file:${BASE_DIR}/conf/

# 设置 app.home
JAVA_OPT="${JAVA_OPT} -Dapp.home=${BASE_DIR}"

# 设置启动的配置文件
JAVA_OPT="-jar ${JAVA_OPT} ${BASE_DIR}/lib/${JAR_NAME} --spring.config.location=${CUSTOM_SEARCH_LOCATIONS}"
JAVA_OPT="${JAVA_OPT} --logging.config=${BASE_DIR}/conf/${LOGBACK_XML_NAME}.xml"
# 配置日志文件生成的位置
JAVA_OPT="${JAVA_OPT} --logging.log-path=${BASE_DIR}/logs"



# 项目日志位置
if [ ! -d "${BASE_DIR}/logs" ]; then
  mkdir ${BASE_DIR}/logs
fi

# 启动时输出启动的日志
if [ ! -f "${BASE_DIR}/logs/start.out" ]; then
  touch "${BASE_DIR}/logs/start.out"
fi

# 将启动的 java 相关的配置信息打印到日志文件中
echo "${JAVA} ${JAVA_OPT} ${BASE_DIR}/lib/${JAR_NAME}" > ${BASE_DIR}/logs/start.out 2>&1 &

# 将错误日志 和 正常输入日志重定向到 start.out 中去
nohup ${JAVA} ${JAVA_OPT} >> ${BASE_DIR}/logs/start.out 2>&1 &

echo "${JAR_NAME} is starting，you can check the ${BASE_DIR}/logs/start.out"