<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Home Page</title>
    <%--
    <link href="${pageContext.request.contextPath} /css/index.css"
          rel="stylesheet"
          type="text/css"/>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css"/>--%>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>

        * {
            box-sizing: border-box;
        }
        body {
            font-family: Arial, Helvetica, sans-serif;
            margin: 0;
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
</head>
<body>

<div class="header">
    <%@ include file="/css/Include/header.jsp" %>

</div>

<div class="navbar">
    <a href="#" class="active">Home</a>
    <a href="api/one">Available Blood</a>
    <a href="api/two">Data</a>
    <a href="#">Blood Donate</a>

    <a href="${pageContext.request.contextPath}/login" class="right">Login</a><%--
    <a href="${pageContext.request.contextPath}/logout" class="right">Logout</a>--%>
    <a href="/registration" class="right">Registration</a>
</div>

<div class="row">
    <div class="side">
        <h2>About Blood bank</h2>
        <img src="${pageContext.request.contextPath}/css/Image/BloodBank.jpg" alt="Blood Bank" width="1350" height="600">
        <img src="${pageContext.request.contextPath}/css/Image/BloodBank.jpg" alt="Blood Bank" width="1350" height="600">


        <img src ="${pageContext.request.contextPath}/css/Image/BloodBank.jpg" alt="/" width="1350" height="600"/>
        <img alt="Image" src="<%=request.getContextPath() + "/css/Image/BloodBank.jpg"%>" style="width: 400px; height: 300px;">
        <p>Blood banking is the process that takes place in the lab to make sure that donated blood, or blood products, are safe before they are used in blood transfusions and other medical procedures. Blood banking includes typing the blood for transfusion and testing for infectious diseases.</p>

    </div>



    <div>
        <h2>Types of blood transfused</h2>
        <p>Several types of blood transfusion exist:[citation needed]

            Whole blood, which is blood transfused without separation.
            Red blood cells or packed cells is transfused to patients with anemia/iron deficiency. It also helps to improve the oxygen saturation in blood. It can be stored at 1.0 °C-6.0 °C for 35–45 days.

            Platelet transfusion is transfused to those with low platelet count. Platelets can be stored at room temperature for up to 5–7 days. Single donor platelets, which have a more platelet count but it is bit expensive than regular.
            Plasma transfusion is indicated to patients with liver failure, severe infections or serious burns. Fresh frozen plasma can be stored at a very low temperature of -25 °C for up to 12 months. The separation of plasma from a donor's blood is called plasmodesmas. </p>

    </div>



    <div>
        <h2>History</h2>

        <p>While the first blood transfusions were made directly from donor to receiver before coagulation, it was discovered that by adding anticoagulant and refrigerating the blood it was possible to store it for some days, thus opening the way for the development of blood banks. John Braxton Hicks was the first to experiment with chemical methods to prevent the coagulation of blood at St Mary's Hospital, London, in the late 19th century. His attempts, using phosphate of soda, however, were unsuccessful.[citation needed]

            The first non-direct transfusion was performed on March 27, 1914, by the Belgian doctor Albert Hustin, though this was a diluted solution of blood. The Argentine doctor Luis Agote used a much less diluted solution in November of the same year. Both used sodium citrate as an anticoagulant.
        </p>
    </div>



    <div>
        <h2>Collection and processing</h2>

        <p>In the U.S., certain standards are set for the collection and processing of each blood product. "Whole blood" (WB) is the proper name for one defined product, specifically unseparated venous blood with an approved preservative added. Most blood for transfusion is collected as whole blood. Autologous donations are sometimes transfused without further modification, however whole blood is typically separated (via centrifugation) into its components, with red blood cells (RBC) in solution being the most commonly used product. Units of WB and RBC are both kept refrigerated at 33.8 to 42.8 °F (1.0 to 6.0 °C), with maximum permitted storage periods (shelf lives) of 35 and 42 days respectively. RBC units can also be frozen when buffered with glycerol, but this is an expensive and time-consuming process, and is rarely done. Frozen red cells are given an expiration date of up to ten years and are stored at −85 °F (−65 °C).

            The less-dense blood plasma is made into a variety of frozen components, and is labeled differently based on when it was frozen and what the intended use of the product is. If the plasma is frozen promptly and is intended for transfusion, it is typically labeled as fresh frozen plasma. If it is intended to be made into other products, it is typically labeled as recovered plasma or plasma for fractionation. Cryoprecipitate can be made from other plasma components. These components must be stored at 0 °F (−18 °C) or colder, but are typically stored at −22 °F (−30 °C). The layer between the red cells and the plasma is referred to as the buffy coat and is sometimes removed to make platelets for transfusion. Platelets are typically pooled before transfusion and have a shelf life of 5 to 7 days, or 3 days once the facility that collected them has completed their tests. Platelets are stored at room temperature (72 °F or 22 °C) and must be rocked/agitated. Since they are stored at room temperature in nutritive solutions, they are at relatively high risk for growing bacteria.
            Some blood banks also collect products by apheresis. The most common component collected is plasma via plasmapheresis, but red blood cells and platelets can be collected by similar methods. These products generally have the same shelf life and storage conditions as their conventionally-produced counterparts.

            Donors are sometimes paid; in the U.S. and Europe, most blood for transfusion is collected from volunteers while plasma for other purposes may be from paid donors.

            Most collection facilities as well as hospital blood banks also perform testing to determine the blood type of patients and to identify compatible blood products, along with a battery of tests (e.g. disease) and treatments (e.g. leukocyte filtration) to ensure or enhance quality. The increasingly recognized problem of inadequate efficacy of transfusion[15] is also raising the profile of RBC viability and quality. Notably, U.S. hospitals spend more on dealing with the consequences of transfusion-related complications than on the combined costs of buying, testing/treating, and transfusing their blood.[16]
        </p>
    </div>



</div>
<div class="footer">
    <h5> <%@ include file="/css/Include/fooder.jsp" %></h5>
</div>

</body>
</html>