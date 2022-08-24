<%--
  Created by IntelliJ IDEA.
  User: kawsu
  Date: 11/29/2021
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Blood List</title>
    <style>

        * {
            box-sizing: border-box;
        }
        body {
            font-family: Arial, Helvetica, sans-serif;
            margin: 0;
        }
        .button {
            background-color: #008CBA; /* Green */
            border: none;
            color: white;
            padding: 10px 22px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }
        .add-button {
            background-color: #008CBA; /* Blue */
            border: none;
            color: white;
            padding: 10px 22px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }
        /* Style the body */


        /* Header/logo Title */
        .header {
            padding: 80px;
            text-align: center;
            background: #1abc9c;
            color: white;
        }

        /* Increase the font size of the heading */
        .header h1 {
            font-size: 40px;
        }

        /* Sticky navbar - toggles between relative and fixed, depending on the scroll position. It is positioned relative until a given offset position is met in the viewport - then it "sticks" in place (like position:fixed). The sticky value is not supported in IE or Edge 15 and earlier versions. However, for these versions the navbar will inherit default position */
        .navbar {
            overflow: hidden;
            background-color: #333;
            position: sticky;
            position: -webkit-sticky;
            top: 0;
        }

        /* Style the navigation bar links */
        .navbar a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }


        /* Right-aligned link */
        .navbar a.right {
            float: right;
        }

        /* Change color on hover */
        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }

        /* Active/current link */
        .navbar a.active {
            background-color: #666;
            color: white;
        }

        /* Column container */
        .row {
            display: -ms-flexbox; /* IE10 */
            display: flex;
            -ms-flex-wrap: wrap; /* IE10 */
            flex-wrap: wrap;
        }

        /* Create two unequal columns that sits next to each other */
        /* Sidebar/left column */
        .side {
            -ms-flex: 30%; /* IE10 */
            flex: 30%;
            background-color: #f1f1f1;
            padding: 20px;
        }

        /* Main column */
        .main {
            -ms-flex: 70%; /* IE10 */
            flex: 70%;
            background-color: white;
            padding: 20px;
        }

        /* Fake image, just for this example */
        .fakeimg {
            background-color: #aaa;
            width: 100%;
            padding: 20px;
        }

        /* Footer */
        .footer {
            padding: 20px;
            text-align: center;
            background: #ddd;
        }

        /* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */
        @media screen and (max-width: 700px) {
            .row {
                flex-direction: column;
            }
        }

        /* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
        @media screen and (max-width: 400px) {
            .navbar a {
                float: none;
                width: 100%;
            }
        }
        form {
            margin-top: 10px;
        }

        label {
            font-size: 16px;
            width: 100px;
            display: block;
            text-align: right;
            margin-right: 10px;
            margin-top: 8px;
            margin-bottom: 8px;
        }

        input {
            width: 250px;
            border: 1px solid #666;
            border-radius: 5px;
            padding: 4px;
            font-size: 16px;
        }

        .save {
            font-weight: bold;
            width: 130px;
            padding: 5px 10px;
            margin-top: 30px;
            background: #cccccc;
        }

        table {
            border-style:none;
            width:50%;
        }

        tr:nth-child(even) {background: #FFFFFF}
        tr:nth-child(odd) {background: #FFFFFF}

        tr {
            border-style:none;
            text-align:left;
        }

        body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: #955251;
        }

        * {
            box-sizing: border-box;
        }

        /* Add padding to containers */
        .container {
            padding: 16px;
            background-color: white;
        }

        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus, input[type=password]:focus {
            background-color: #ddd;
            outline: none;
        }

        /* Overwrite default styles of hr */
        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }

        /* Set a style for the submit button */
        .registerbtn {
            background-color: #04AA6D;
            color: white;
            padding: 16px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
        }

        .registerbtn:hover {
            opacity: 1;
        }

        /* Add a blue text color to links */
        a {
            color: dodgerblue;
        }

        /* Set a grey background color and center the text of the "sign in" section */
        .signin {
            background-color: #f1f1f1;
            text-align: center;
        }
    </style>
    <%--
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css"/>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/css/add-user-style.css">

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/css/a.css">--%>

</head>
<body>

<div id="wrapper">



    <div class="header">
        <%@ include file="/css/Include/header.jsp" %>

    </div>

    <div class="navbar">
        <a href="../index.jsp" class="active">Home</a>
        <a href="one">Available Blood</a>
        <a href="two">Data</a>
        <a href="#">Blood Donate</a>
        <a href="${pageContext.request.contextPath}/logout" class="right">Logout</a>
    </div>


</div>

<div id="container">

    <div id="content">

        <input type="button" value="Add New blood"
               onclick="window.location.href='create'; return false;"
               class="add-button">

        <br><br>

        <form:form action="search" method="GET">
            Search user by firstname: <input type="text" name="searchValue"/>
            <input type="submit" value="Search" class="add-button"/>
        </form:form>

        <table>
            <tr>
                <th>ID</th>
                <th>BloodGroup</th>
                <th>Address</th>
                <th>Quantity</th>
                <th>PhoneNumber</th>

            </tr>

            <c:forEach var="blood" items="${blood}">

                <c:url var="updateLink" value="/api/update">
                    <c:param name="bloodId" value="${blood.id}"/>
                </c:url>

                <c:url var="deleteLink" value="/api/delete">
                    <c:param name="bloodId" value="${blood.id}"/>
                </c:url>

                <tr>

                    <td> ${blood.id} </td>
                    <td> ${blood.bloodGrop} </td>
                    <td> ${blood.address} </td>
                    <td> ${blood.quantity} </td>

                    <td>
                        <a href="${updateLink}">Update</a> | <a href="${deleteLink}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>


    </div>
</div>
<div class="footer">
    <h5> <%@ include file="/css/Include/fooder.jsp" %></h5>
</div>
</body>
</html>
