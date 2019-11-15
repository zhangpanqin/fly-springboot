### Tomcat 执行流程
- StandardWrapperValve.invoke  找到 servlet ,看 servlet 是否执行了 init 方法
- ApplicationFilterChain.doFilter  执行 filter 和 执行 servlet.service
### Web 下的 ApplicationContext
> AnnotationConfigServletWebServerApplicationContext
### HandlerMapping
- RequestMappingHandlerMapping
处理请求用。
- SimpleUrlHandlerMapping
- 处理静态资源