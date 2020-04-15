<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Lesson 57. Javascript 101</title>
	<link rel="stylesheet" href="css/styles.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css">

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body class="no-scroll">
  <div class="container">
    <div class="row justify-content-center">
      <div class="col col-lg-7 posts-container">
        <div class="col-lg-10">
          <input type="file" class="form-control h-auto">
        </div>
        <!-- single post start -->
        <div class="card my-3">
          <!-- image block start -->
          <div id="image">
            <img class="d-block w-100" src="http://placekitten.com/500/500" alt="Post image">
          </div>
          <!-- image block end -->
          <div class="px-4 py-3">
            
            <!-- post reactions block start -->
            <div id = "options"class="d-flex justify-content-around">
              <!-- <span class="h1 mx-2 text-danger">
                <i class="fas fa-heart"></i>
              </span> -->

              <span class="h1 mx-2 muted">
                <i class="far fa-heart"></i>
              </span>

              <span class="h1 mx-2 muted">
                <i class="far fa-comment"></i>
              </span>
              <span class="mx-auto"></span>

              <span class="h1 mx-2 muted">
                <i class="far fa-bookmark"></i>
              </span>
              <!-- <span class="h1 mx-2 muted">
                <i class="fas fa-bookmark"></i>
              </span> -->
            </div>
            <!-- post reactions block end -->
            <hr>
            <!-- post section start -->
            <div>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsum ad est cumque nulla voluptatem enim voluptas minima illum quis! Voluptatibus dolorem minus tempore aliquid corrupti nesciunt, obcaecati fuga natus officiis.</p>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsum ad est cumque nulla voluptatem enim voluptas minima illum quis! Voluptatibus dolorem minus tempore aliquid corrupti nesciunt, obcaecati fuga natus officiis.</p>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsum ad est cumque nulla voluptatem enim voluptas minima illum quis! Voluptatibus dolorem minus tempore aliquid corrupti nesciunt, obcaecati fuga natus officiis.</p>
            </div>
            <!-- post section end -->
            <hr>
            <!-- comments section start -->
            <div class="comments" >
              <div class="py-2 pl-3 comment">
                <a href="#" class="muted">someusername</a>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsum ad est cumque nulla voluptatem enim voluptas minima illum quis! Voluptatibus dolorem minus tempore aliquid corrupti nesciunt, obcaecati fuga natus officiis.</p>
              </div>
              <div class="py-2 pl-3 comment">
                <a href="#" class="muted">someusername</a>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsum ad est cumque nulla voluptatem enim voluptas minima illum quis! Voluptatibus dolorem minus tempore aliquid corrupti nesciunt, obcaecati fuga natus officiis.</p>
              </div>
                <form>
                  <textarea placeholder="Добавьте комментарий..." id="test" style="height: 50px; width: 460px;"></textarea>
                  <button id="btn"  type="submit">Опубликовать</button>
                </form>
                
            </div>
            

            <!-- comments section end -->
          </div>

        </div>
        <!-- single post end -->
      </div>
            <div id = "posts-container", class="col col-lg-7 posts-container"> </div>

    </div>

  </div>
  <!-- Splash screen -->
  <section id="page-splash" class="page-splash" >
    <div class="card" id="registration-form">
      <div class="card-body">
        <h3 class="h3">Зарегистрируйтесь</h3>
        
      </div>
      <button id = "button" type="button" class="btn btn-secondary" style="padding: 15px;"><h4>Войти</h4></button>
<#--      <form id="form" name="form" action="/demo/post" method="post">-->
<#--        <input type="text" placeholder="Логин" name="login">-->
<#--        <input type="password" placeholder="Пароль" name="password">-->
<#--        <button type="submit">Войти</button>-->
<#--      </form>-->
    </div>
  </section>
</body>
</html>
<script src="js/script.js"></script>