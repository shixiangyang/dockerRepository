# 基于哪个镜像
FROM java:8

# 签名啦
MAINTAINER sharker "260001579@qq.com"

# 将本地文件夹挂载到当前容器
# VOLUME /tmp

# 拷贝文件到容器，也可以直接写成ADD dockerRepository-1.0-SNAPSHOT.jar /app.jar
ADD ./target/dockerRepository-1.0-SNAPSHOT.jar /tmp/app.jar
RUN bash -c 'touch /app.jar'

# 开放 8080 端口
EXPOSE 8080

# 配置容器启动后执行的命令
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

CMD ["java", "-Xmx200m", "-jar", "/app/app.jar"]