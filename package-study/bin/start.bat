@echo off


rem 判断 JAVA_HOME 配置了吗
if not exist "%JAVA_HOME%\bin\java.exe" echo Please set the JAVA_HOME variable in your environment, We need java(x64)! jdk8 or later is better! & EXIT /B 1

rem 设置启动的 java.exe 绝对路径
set "JAVA=%JAVA_HOME%\bin\java.exe"
setlocal enabledelayedexpansion

rem 启动 package-study
rem 设置启动的 jar 包名称
set SERVER=package-study


rem 获取包的根路径
set BASE_DIR=%~dp0
rem 去除路径中的 \bin\
set BASE_DIR="%BASE_DIR:~0,-5%"


rem 设置 jvm 配置信息
set "JAVA_OPT=%JAVA_OPT% -server -Xms1g -Xmx1g -Xmn512m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m"
rem 设置 gc 日志相关
set "JAVA_OPT=%JAVA_OPT% -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=%BASE_DIR%/logs/java_heapdump.hprof"

rem 设置 app.home
set "JAVA_OPT=%JAVA_OPT% -Dapp.home=%BASE_DIR%"
rem 设置启动的 jar
set "JAVA_OPT=%JAVA_OPT% -jar %BASE_DIR%\lib\%SERVER%.jar"

rem 定义 springboot 加载配置文件
set DEFAULT_SEARCH_LOCATIONS="classpath:/,classpath:/config/,file:./,file:./config/"
set CUSTOM_SEARCH_LOCATIONS=%DEFAULT_SEARCH_LOCATIONS%,file:%BASE_DIR%/conf/

rem 设置启动的配置文件目录
set "JAVA_OPT=%JAVA_OPT% --spring.config.location=%CUSTOM_SEARCH_LOCATIONS%"

rem 设置启动的日志配置文件
set "JAVA_OPT=%JAVA_OPT% --logging.config=%BASE_DIR%/conf/logback-spring.xml"
set "JAVA_OPT=%JAVA_OPT% --logging.log-path=%BASE_DIR%/logs"
call "%JAVA%" %JAVA_OPT% %*

pause