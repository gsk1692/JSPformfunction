<%--
  Created by IntelliJ IDEA.
  User: gokulskrishnan
  Date: 17/03/16
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Hello World</title>
      <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
      <script src="js/jquery-1.12.2.min.js"></script>
      <script src="js/bootstrap.js"></script>
  </head>
  <body class="jumbotron">
  <div class="container-fluid">
      <h2>Hello Google...!!</h2>
      <p>Chumma Text</p>
      <form action="QuickServlet" method="post">
          <div class="input-large">
          <!--Form Action must be same as the url mapping tag for the corresponding servlet mapping tag in the web.xml file. -->
              <h3>MENU</h3><br>
              <p>1. Choice 1<br>2. Choice 2<br>3. Choice 3<br>4. Another Function<br></p>
              <label>Enter Choice:</label>
              <input type="text" class="form-control" name="choice" placeholder="Enter Choice">
              <input type="submit" class="btn btn-primary" value="Submit">
          </div>
      </form>
      <br>
  </div>
  </body>
</html>
