<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="../css/style.css"></script>
</head>
<body>
<div class="notebook">
    <input type="radio" name="notebook1" id="notebook1_1">
    <label for="notebook1_1">Average</label>
    <input type="radio" name="notebook1" id="notebook1_2">
    <label for="notebook1_2">Summ</label>
    <input type="radio" name="notebook1" id="notebook1_3">
    <label for="notebook1_3">Score</label>

    <div>
        <form action="/average" method="post">
            Firstname: <input type="text" name="firstname" required> <br>
            Surname: <input type="text" name="surname" required> <br>
            Lastname: <input type="text" name="lastname" required> <br>
            <button type="submit">average</button>
        </form>
    </div>
    <div>
        <form action="/sum" method="post">
            Firstname: <input type="text" name="firstname" required> <br>
            Surname: <input type="text" name="surname" required> <br>
            Lastname: <input type="text" name="lastname" required> <br>
            <button type="submit">summ</button>
        </form>
    </div>
    <div>
        <form action="/score" method="post">
            Firstname: <input type="text" name="firstname" required> <br>
            Surname: <input type="text" name="surname" required> <br>
            Lastname: <input type="text" name="lastname" required> <br>
            <select name="subject">
                <option value="0">PROGRAMMING</option>
                <option value="1">ENGLISH</option>
                <option value="2">PROBABILITY_THEORY</option>
                <option value="3">NETWORKS</option>
                <option value="4">DATABASES</option>
            </select>
            <br>
            <button type="submit">score</button>
        </form>
    </div>
</div>
</body>
</html>