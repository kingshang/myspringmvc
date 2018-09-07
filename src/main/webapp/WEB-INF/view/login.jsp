<%@page language="java" contentType="text/html; charset=utf-8"
        pageEncoding="utf-8" %>
<!doctype html>
<html>
<head>
    <script src="/static/jquery-ui-1.12.1/external/jquery/jquery.js"></script>
    <script src="/static/js/bootstrap.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/css/bootstrap.css"/>

    <script src="/static/jquery-ui-1.12.1/jquery-ui.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/jquery-ui-1.12.1/jquery-ui.css"/>
</head>
<body>
<form>
    <div class="container">
        <!-- Content here -->

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">宁都拉</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01"
                    aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarColor01">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/demo/assistor">assistor</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/demo/login">login</a>
                    </li>
                </ul>
                <form class="form-inline">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>
        <div class="row">
            <div class="col-4 offset-4">
                <form class="form-signin" action="/demo/login.do" method="post">
                    <div class="text-center mb-4">
                        <img class="mb-4" src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg" alt=""
                             width="72"
                             height="72">
                        <h1 class="h3 mb-3 font-weight-normal">Login</h1>
                    </div>

                    <div class="form-label-group">
                        <input type="text" name="userid" class="form-control" placeholder="userid" required=""
                               autofocus="">
                        <label for="userid">userid</label>
                    </div>

                    <div class="form-label-group">
                        <input type="password" name="password" class="form-control" placeholder="Password"
                               required="">
                        <label for="password">Password</label>
                    </div>

                    <div class="checkbox mb-3">
                        <label>
                            <input type="checkbox" value="remember-me"> Remember me
                        </label>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                    <p class="mt-5 mb-3 text-muted text-center">© 2017-2018</p>
                </form>
            </div>
        </div>
    </div>
</form>
<script>
</script>
</body>
</html>
