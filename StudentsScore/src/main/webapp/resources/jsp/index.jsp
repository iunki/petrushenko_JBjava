<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <style>
        .notebook {
            width: 300px;
            white-space: nowrap;
            overflow: hidden;
        }

        .notebook > input {
            display: none;
        }

        .notebook > input + label {
            display: inline-block;
            border: 1px solid gray;
            padding: 4px;
            cursor: pointer;
            position: relative;
        }

        .notebook > input + label:not(:last-of-type) {
            border-right: none;
        }

        .notebook > input + label:hover {
            color: blue;
        }

        .notebook > input + label:last-of-type::after {
            display: block;
            border-bottom: 1px solid gray;
            width: 2000px;
            content: "";
            position: absolute;
            bottom: -1px;
            left: 100%;
        }

        .notebook > input:checked + label {
            color: blue;
            border-bottom: none;
            padding-bottom: 5px;
        }

        .notebook > input:checked + label:last-of-type::after {
            bottom: 0px;
        }

        .notebook > div {
            white-space: normal;
            display: none;
            border: 1px solid gray;
            border-top: none;
            margin: 0px;
            padding: 2px 20px;
        }

        .notebook > input:nth-of-type(1):checked ~ div:nth-of-type(1),
        .notebook > input:nth-of-type(2):checked ~ div:nth-of-type(2),
        .notebook > input:nth-of-type(3):checked ~ div:nth-of-type(3),
        .notebook > input:nth-of-type(4):checked ~ div:nth-of-type(4) {
            display: block;
        }
    </style>
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