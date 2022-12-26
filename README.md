<p align="center">
 <h2 align="center">Hướng dẫn tạo 1 project spring boot - jsp</h2>
</p>

Spring Data JPA, một phần của  Spring Data , giúp dễ dàng triển khai các kho lưu trữ dựa trên JPA. Mô-đun này liên quan đến hỗ trợ nâng cao cho các lớp truy cập dữ liệu dựa trên JPA. Nó giúp việc xây dựng các ứng dụng dựa trên Spring sử dụng các công nghệ truy cập dữ liệu trở nên dễ dàng hơn.


# JPA là gì

Spring Boot JPA là một bản ghi chi tiết của Java để quản lý dữ liệu quan hệ trong các ứng dụng Java. JPA tuân theo Object-Relation Mapping (ORM). JPA cung cấp một API EntityManager runtime để xử lý các câu query và giao dịch trên các object dựa trên database. Nó sử dụng ngôn ngữ truy vấn hướng đối tượng độc lập nền tảng JPQL (Java Persistent Query Language).

# Tại sao chúng ta nên sử dụng JPA

-JPA tránh viết Ngôn Ngữ Định Nghĩa Dữ Liệu (DDL) bằng phương ngữ SQL dành riêng cho database. Thay vào đó nó cho phép ánh xạ trong XML hoặc sử dụng các annotation Java.\
-JPA cho phép chúng ta tránh viết Ngôn Ngữ Thao Tác Dữ Liệu (DML) bằng phương ngữ SQL dành riêng cho database.\
-JPA cho phép chúng ta save và load các object và đồ thị Java mà không cần bất kỳ ngôn ngữ DML nào.\
-Khi chúng ta cần thực hiện các truy vấn JPQL, nó cho phép chúng ta viết các truy vấn dưới dạng các entity Java mà không phải là bảng và cột SQL.\

# Ví Dụ 

## tạo project 

chọn new project -> next -> create

![image](https://user-images.githubusercontent.com/109157942/209517555-bb1bc197-1e12-4ab8-bbd6-91a4fa678282.png)

![image](https://user-images.githubusercontent.com/109157942/209517664-b7a63082-bf42-4c77-837a-68dfd6ef324c.png)


> Cấu trúc thư mục 
  
  ![image](https://user-images.githubusercontent.com/109157942/209515215-78f583d2-e906-4a77-b220-b77dcdf009fd.png)


## File pom.xml

Thực hiện dependency để chạy dự án 

```

     <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
    </dependency>

```

để cập nhật lại file pom nhấn chuột phải -> maven -> reload project

##TTạo class với file hello trong package controller

Đánh dấu class là controller bằng cách sử dụng annotation @Controller

```
@Controller
public class Hello {

    @RequestMapping("/")   // ánh xạ các yêu cầu web tới các phương thức của Bộ điều khiển Spring. (http://localhost:8080/)
    public String welcome(Map<String, Object> model) {
        model.put("message", "hello"); 
        return "hello"; // return file hello.jsp trong packge view 
    }
}

```

## Hello.jsp

```

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<h2>Spring Boot JSP Hello World Example</h2>
<h2>Message: ${message}</h2> // biến truyền vào từ controller (model.put("message", "hello")-> model.put(Thuộc tính, giá trị)) 
</body>
</html>

```


## Cấu hình application.properties

```

spring.mvc.view.prefix: /WEB-INF/view/
spring.mvc.view.suffix: .jsp

```


> Nhấn http://localhost:8080/ trong trình duyệt, kết quả sau sẽ xuất hiện.


# kết bài 
Trong bài viết này, chúng ta đã học cách tạo 1 project spring boot - jsp

tất cả các mẫu mã hiển thị trong bài viết đều có sẵn [trên github](https://github.com/thangdtph27626/HelloWordWithSpringBootJPA.github.io)

