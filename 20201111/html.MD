
```html
20201111 html
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            div {
                width: 100px;
                height: 100px;
                background: linear-gradient(45deg, #333333 33%, #999999 66%, #ffffff 100%);
            }

        </style>
    </head>
    <body>
        <div>

        </div>
    </body>
</html>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
박스 내용 이해하기~~~~~
-->html 박스 이미지 검색
https://aboooks.tistory.com/199

<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            body {
                margin: 0;
                padding: 0;
            }

            .a {
                width: 100px;
                height: 100px;
                background-color: #dddddd;
                padding: 20px;
                box-sizing: border-box;
                border: 3px solid red;
                margin: 20px;
                overflow: hidden;
            }

            .b {
                width: 100%;
                height: 100%;
                padding: 20px;
                background-color: black;
            }

            .c {
                width: 100%;
                height: 100%;
                background-color: darkgreen;
            }
        </style>
    </head>
    <body>
        <div class="a">
            <div class="b">
                <div class="c"></div>
            </div>
        </div>
    </body>
</html>

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
블록과 인라인의 차이점

<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>

            .a { background-color: red; }
            .b { background-color: green; }
            .c { background-color: blue;}

            .l1 { background-color: red; }
            .l2 { background-color: green; }
            .l3 { background-color: blue;}

        </style>
    </head>
    <body>
        <span class="l1">글자1</span>
        <span class="l2">글자2</span>
        <span class="l3">글자3</span>
        
        <div class="a box">a</div>
        <div class="b box">b</div>
        <div class="c box">c</div>
    </body>
</html>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            img {
                border: 10px solid black;
            }

        </style>
    </head>
    <body>
        <img src="http://www.foodnmed.com/news/photo/201903/18296_3834_4319.jpg">
        <img src="http://www.foodnmed.com/news/photo/201903/18296_3834_4319.jpg">
        <img src="http://www.foodnmed.com/news/photo/201903/18296_3834_4319.jpg">
    </body>
</html>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            .box {
                width: 100px;
                height: 100px;
                display: inline-block;
            }

            .a { background-color: red; }
            .b { background-color: green; }
            .c { background-color: blue;}

        </style>
    </head>
    <body>
        <div class="a box"></div>
        <div class="b box"></div>
        <div class="c box"></div>
    </body>
</html>

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
border

<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            .box {
                /*
                border: 테두리 굵기, 스타일, 색상
                */
                width: 100px;
                height: 100px;
                background-color: grey;
                border-style: solid;
                border-width: 5px;
                border-color: blue;
                border-radius: 10px;
                border: 5px solid red; --> 이렇게 한번에 나타낼 수 있음
            }

        </style>
    </head>
    <body>
        <div class="box"></div>

    </body>
</html>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
******박스모델******

<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            .box {
                /*
                border: 테두리 굵기, 스타일, 색상
                */
                width: 100px;
                height: 100px;
                background-color: grey;
                border: 3px solid black;
                padding: 20px;
                box-sizing: border-box;
                border-radius: 1px 2px 3px 4px;
            }
            /*
            100px + 20px + 20px + 3px + 3px
            */

        </style>
    </head>
    <body>
        <div class="box"></div>
    </body>
</html>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            .box {
                width: 300px;
                height: 300px;
                margin: 10px;
                padding: 20px;
                border: 3px solid red;
            }

            .content-box {
                background-color: #002f9c;
                box-sizing: content-box;
            }

            .border-box {
                background-color: aquamarine;
                box-sizing: border-box;
            }


        </style>
    </head>
    <body>
        <div class="box content-box"></div>
        <div class="box border-box"></div>
    </body>
</html>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            .container {
                position: absolute;
                width: 50%;
                background-color: black;
            }

            .box {
                width: 100px;
                height: 100px;
                box-sizing: border-box;
            }

            .box-left {
                float: left;
            }

            .box-right {
                float: right;
            }

            .red { background-color: red; }
            .blue { background-color: blue; }
            .green { background-color: green; }
            .yellowgreen { background-color: yellowgreen; }


        </style>
    </head>
    <body>
        <div class="container">
            <div class="box box-left red"></div>
            <div class="box box-left blue"></div>
            <div class="box box-left green"></div>
            <div class="box box-right yellowgreen"></div>
        </div>
    </body>
</html>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
4번 레이아웃 실습~~~~

<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            div {
                border: 1px solid #eeeeee;
                padding: 20px;
                margin-bottom: 20px;
                box-sizing: border-box;
            }

            .article {
                width: 68%;
                float: left;
            }

            .sidebar {
                width: 30%;
                float: right;
            }

            .footer {
                clear: both;
            }


        </style>
    </head>
    <body>
        <div class="container">
            <div class="header">
                <h1>이곳은 헤더</h1>
            </div>
            <div class="article">
                <h1>본문</h1>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
            </div>
            <div class="sidebar">
                <h1>사이드바</h1>
                <ul>
                    <li>리스트1</li>
                    <li>리스트2</li>
                </ul>
            </div>
            <div class="footer">
                <h1>푸터</h1>
                <p>발바닥</p>
            </div>
        </div>
    </body>
</html>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            body {
                padding: 0;
                margin: 0;
            }
            .container {
                width: 100%;
                height: 100%;
                position: relative;
                background-color: grey;
            }

            .box {
                top: 50px;
                left: 50px;
                width: 100px;
                height: 100px;
            }

            .box1 {
                position: relative;
                background-color: red;
                top: 50px;
                left: 50px;
                z-index: 1; -->박스가 겹쳐져 있을때 우선권 주는거.
            }

            .box2 {
                position: relative;
                top: 0px;
                left: 0px;
                background-color: blue;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="box box2"></div>
            <div class="box box1"></div>
        </div>
    </body>
</html>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
flex컨테이너에서 flex item의 줄바꿈 설정  flex-wrap
https://dev-syhy.tistory.com/30

<!DOCTYPE html>
<html>
    <head>
        <title>20201111 실습</title>
        <style>
            body {
                padding: 0;
                margin: 0;
            }

            .flex-container {
                display: flex;
                flex-wrap: wrap-reverse;
                width: 100%;
                height: 100vh;
                background-color: #127cc1;
            }

            .flex-item {
                width: 100px;
                height: 100px;
                box-sizing: border-box;
                border: 1px solid black;
                align-content: center;
            }

            .item1 {
                background-color: #8bf0fd;
                order: 4;
            }

            .item2 {
                background-color: #4365fd;
                order: 2;
            }

            .item3 {
                background-color: #fd46f4;
                order: 1;
            }

            .item4 {
                background-color: red;
                order: 3;
            }

        </style>
    </head>
    <body>
        <div class="flex-container"> <!-- flex container -->
            <!-- flex item -->
            <div class="flex-item item1">1</div>
            <div class="flex-item item2">2</div>
            <div class="flex-item item3">3</div>
            <div class="flex-item item4">4</div>                       
        </div>
    </body>
</html>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
```