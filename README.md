# 项目技术栈与使用说明

## 技术栈
- Spring Boot 2.x
- Maven 3.x
- Java 17
- Lombok
- Hibernate/JPA
- MySQL 5.7+/PostgreSQL

## 环境要求
- JDK 11+
- Maven 3.6+
- MySQL 5.7+/PostgreSQL 10+

## 后端启动步骤
1. 确保已安装JDK和Maven
2. 在项目根目录(server/)下执行:
```bash
mvn clean install
mvn spring-boot:run
```
3. 应用默认启动在8080端口

## 数据库配置
1. 修改`application.properties`文件中的数据库连接信息:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
```
2. 根据实际数据库类型修改驱动类名

## 常见问题
- 端口冲突: 修改`server.port`属性
- 数据库连接失败: 检查数据库服务是否运行
- Lombok注解无效: 确保IDE安装了Lombok插件

## API测试示例
使用PowerShell测试POST请求:
```powershell
Invoke-RestMethod -Uri http://localhost:8080/api/items -Method POST -ContentType application/json -Body '{"name":"测试条目"}'
```