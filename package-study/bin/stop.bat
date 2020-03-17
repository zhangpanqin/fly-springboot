@echo off
rem 配置杀死 package-study
setlocal

rem 设置 jar 名称
set SERVER=package-study

if not exist "%JAVA_HOME%\bin\jps.exe" echo Please set the JAVA_HOME variable in your environment, We need java(x64)! jdk8 or later is better! & EXIT /B 1

set "PATH=%JAVA_HOME%\bin;%PATH%"

echo "kill %SERVER% ...."

for /f "tokens=1" %%i in ('jps -m ^| find "%SERVER%.jar"') do ( taskkill /F /PID %%i )

echo "kill %SERVER% is ok"