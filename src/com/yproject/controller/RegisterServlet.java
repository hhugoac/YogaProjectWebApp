package com.yproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("txtName");
		response.getWriter().write(" <html>\r\n" + 
				"    <head>\r\n" + 
				"        <title>Practica Yoga</title>\r\n" + 
				"        <meta charset=\"utf-8\">\r\n" + 
				"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n" + 
				"    \r\n" + 
				"        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,800\" rel=\"stylesheet\">\r\n" + 
				"    \r\n" + 
				"        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n" + 
				"        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n" + 
				"        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n" + 
				"    \r\n" + 
				"        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n" + 
				"    \r\n" + 
				"        <link rel=\"stylesheet\" href=\"fonts/ionicons/css/ionicons.min.css\">\r\n" + 
				"        <link rel=\"stylesheet\" href=\"fonts/fontawesome/css/font-awesome.min.css\">\r\n" + 
				"    \r\n" + 
				"        <!-- Theme Style -->\r\n" + 
				"        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n" + 
				"      </head>\r\n" + 
				"      <body>\r\n" + 
				"        \r\n" + 
				"        <head>\r\n" + 
				"          <title>Practica Yoga</title>\r\n" + 
				"          <meta charset=\"utf-8\">\r\n" + 
				"          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n" + 
				"      \r\n" + 
				"          <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,800\" rel=\"stylesheet\">\r\n" + 
				"      \r\n" + 
				"          <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n" + 
				"          <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n" + 
				"          <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n" + 
				"      \r\n" + 
				"          <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n" + 
				"      \r\n" + 
				"          <link rel=\"stylesheet\" href=\"fonts/ionicons/css/ionicons.min.css\">\r\n" + 
				"          <link rel=\"stylesheet\" href=\"fonts/fontawesome/css/font-awesome.min.css\">\r\n" + 
				"      \r\n" + 
				"          <!-- Theme Style -->\r\n" + 
				"          <link rel=\"stylesheet\" href=\"css/style.css\">\r\n" + 
				"        </head>\r\n" + 
				"        <body>\r\n" + 
				"          \r\n" + 
				"          <header role=\"banner\">\r\n" + 
				"            <nav class=\"navbar navbar-expand-md navbar-dark bg-dark\">\r\n" + 
				"              <div class=\"container\">\r\n" + 
				"                <a class=\"navbar-brand\" href=\"index.jsp\">Yoga<span>Studio</span></a>\r\n" + 
				"                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample05\" aria-controls=\"navbarsExample05\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"                  <span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"                </button>\r\n" + 
				"      \r\n" + 
				"                <div class=\"collapse navbar-collapse\" id=\"navbarsExample05\">\r\n" + 
				"                  <ul class=\"navbar-nav mr-auto pl-lg-5 pl-0\">\r\n" + 
				"                    <li class=\"nav-item\">\r\n" + 
				"                      <a class=\"nav-link active\" href=\"index.jsp\">Inicio</a>\r\n" + 
				"                    </li>\r\n" + 
				"                    <li class=\"nav-item\">\r\n" + 
				"                      <a class=\"nav-link\" href=\"about.html\">Sobre nuestro estudio</a>\r\n" + 
				"                    </li>\r\n" + 
				"                    <li class=\"nav-item dropdown\">\r\n" + 
				"                      <a class=\"nav-link dropdown-toggle\" href=\"services.html\" id=\"dropdown04\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Clases</a>\r\n" + 
				"                      <div class=\"dropdown-menu\" aria-labelledby=\"dropdown04\">\r\n" + 
				"                        <a class=\"dropdown-item\" href=\"services.html\">Yoga para niños</a>\r\n" + 
				"                        <a class=\"dropdown-item\" href=\"services.html\">Yoga Vinyasana</a>\r\n" + 
				"                        <a class=\"dropdown-item\" href=\"services.html\">Yoga Ashtanga Guiada</a>\r\n" + 
				"                        <a class=\"dropdown-item\" href=\"services.html\">Yoga Ashtanga Mysore</a>                  \r\n" + 
				"                      </div>\r\n" + 
				"                    </li>\r\n" + 
				"                    <li class=\"nav-item\">\r\n" + 
				"                      <a class=\"nav-link\" href=\"news.html\">Noticias</a>\r\n" + 
				"                    </li>\r\n" + 
				"                    <li class=\"nav-item\">\r\n" + 
				"                        <a class=\"nav-link\" href=\"Triva.jsp\">Unete al reto</a>\r\n" + 
				"                  </li>\r\n" + 
				"                    <li class=\"nav-item\">\r\n" + 
				"                      <a class=\"nav-link\" href=\"contact.html\">Contacto</a>\r\n" + 
				"                    </li>\r\n" + 
				"                  </ul>\r\n" + 
				"      \r\n" +  
				"                  \r\n" + 
				"                </div>\r\n" + 
				"              </div>\r\n" + 
				"            </nav>\r\n" + 
				"          </header>" +
			
				"    \r\n" + 
				"    <section class='home-slider-loop-false  inner-page owl-carousel'>\r\n" + 
				"      <div class='slider-item' style='background-image: url('img/slider-1.jpg');'>\r\n" + 
				"        \r\n" + 
				"        <div class='container'>\r\n" + 
				"          <div class='row slider-text align-items-center justify-content-center'>\r\n" + 
				"            <div class='col-md-8 text-center col-sm-12 element-animate'>\r\n" );
		
				response.getWriter().write("<h1>Hola "+name +"</h1>");
		
				response.getWriter().write("              \r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"\r\n" + 
				"      </div>\r\n" + 
				"\r\n" + 
				"    </section>\r\n" + 
				"    <!-- END slider -->\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    <section class='section'>\r\n" + 
				"      <div class='container'>\r\n" + 
				"        <div class='row justify-content-center'>\r\n" + 
				"          <div class='col-md-12 mb-5'>\r\n" + 
				"            <p class='mb-5'><img src='img/big_img_1.jpg' alt='' class='img-fluid'></p>\r\n" + 
				"            \r\n" + 
				"            <div class='row justify-content-center'>\r\n" + 
				"              <div class='col-md-7 mb-5'>\r\n" + 
				"                <h2 class='mb-5'>Mis clases</h2>\r\n" + 
				"                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Officiis, ab veniam, amet ut at ipsum accusamus! Libero fugiat reiciendis architecto dignissimos, magnam iusto rerum recusandae quidem id omnis optio numquam.</p>\r\n" + 
				"                <blockquote class='float-left quote-content'>\r\n" + 
				"                  <span class='quote'>&ldquo;</span>\r\n" + 
				"                  <p class='text'>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem, dolore! Velit necessitatibus quis enim mollitia suscipit, libero eligendi perspiciatis, nisi labore modi praesentium nihil quidem! Quaerat quibusdam, excepturi mollitia cumque!</p>  \r\n" + 
				"                </blockquote>\r\n" + 
				"                <p>Perspiciatis, tempore, voluptates! Officia minus quas illum nam, beatae modi libero, harum aliquid totam quia nostrum blanditiis accusamus a, illo unde consectetur! Velit, debitis molestias eveniet consequuntur sit temporibus, ullam.</p>\r\n" + 
				"                <p>Nobis maxime perferendis recusandae illo fugit, quas suscipit minima exercitationem laborum, amet fuga ipsum vero inventore dignissimos a maiores eaque. Nobis in nisi repellendus aliquid minima culpa tempore ipsum, pariatur!</p>\r\n" + 
				"                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolor amet, voluptate ipsam sit voluptatibus illo animi expedita eius accusantium doloremque quas nam eos, quaerat harum aut excepturi, eum perspiciatis omnis!</p>\r\n" + 
				"                <p>Tempore magnam quo reiciendis ullam quibusdam sit laboriosam tenetur nobis incidunt. Error culpa corporis aspernatur explicabo esse vero, nobis similique eaque quis repellendus dolore maiores! Molestiae beatae ratione quia a.</p>\r\n" + 
				"                <p>Beatae quasi, totam officiis iste cum eaque maiores voluptatum qui eligendi doloribus pariatur explicabo expedita ullam, veritatis, eos libero numquam maxime cupiditate commodi repellat, illo provident! Quisquam rerum laudantium excepturi!</p>\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"\r\n" + 
				"            <p class='mb-5'><img src='img/big_img_2.jpg' alt='' class='img-fluid'></p>\r\n" + 
				"\r\n" + 
				"            <div class='row justify-content-center'>\r\n" + 
				"              <div class='col-md-7'>\r\n" + 
				"                <blockquote class='float-right quote-content'>\r\n" + 
				"                  <span class='quote'>&ldquo;</span>\r\n" + 
				"                  <p class='text'>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem, dolore! Velit necessitatibus quis enim mollitia suscipit, libero eligendi perspiciatis, nisi labore modi praesentium nihil quidem! Quaerat quibusdam, excepturi mollitia cumque!</p>  \r\n" + 
				"                </blockquote>\r\n" + 
				"                <p>Et asperiores exercitationem quaerat dolore qui vitae ex commodi suscipit amet fugit expedita rem deleniti, reprehenderit cum cumque in recusandae fugiat velit enim ipsum, tenetur voluptate! At fuga aliquam maiores.</p>\r\n" + 
				"                <p>Saepe eaque in, provident fugit, laudantium doloremque quasi et debitis aut possimus eligendi quos doloribus sequi nisi commodi soluta minus architecto numquam id. Facilis non iusto hic, cum temporibus repellendus.</p>\r\n" + 
				"                <p>Exercitationem animi at quo voluptatum saepe, perferendis quisquam sequi, officiis, nostrum laudantium sapiente delectus! Totam, cupiditate qui necessitatibus natus assumenda labore adipisci amet commodi accusamus esse, itaque obcaecati at libero!</p>\r\n" + 
				"                <p>Hic earum accusantium atque quo odit totam unde facere molestias laborum enim, obcaecati nulla beatae soluta, sunt nisi impedit non laudantium numquam omnis, vitae ratione fugiat nesciunt voluptates dolor est.</p>\r\n" + 
				"                <p>Eligendi, repudiandae, quae! Doloremque provident eum earum saepe quam? Distinctio delectus sint praesentium sit blanditiis et, perferendis itaque totam ab. Eligendi et delectus, nulla aut quaerat in non nobis distinctio.</p>\r\n" + 
				"                <p>Veniam nulla unde, rerum aut, porro nihil placeat voluptates inventore, laborum tempora dignissimos. Iste, placeat, aut? Quia ea tempore, temporibus quam eligendi, voluptates voluptatibus aperiam dolorum? Sequi dolorum consequatur accusantium.</p>\r\n" + 
				"                <p>Omnis ipsa rem in magnam earum quaerat, repudiandae inventore eius maiores expedita assumenda a, officia dolore rerum! Cum ab repudiandae, pariatur corporis voluptates soluta architecto labore quasi error voluptate velit.</p>\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"\r\n" + 
				"          </div>\r\n" + 
				"\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </section>\r\n" + 
				"\r\n" + 
				"    <footer class='site-footer' role='contentinfo'>\r\n" + 
				"      <div class='container'>\r\n" + 
				"        <div class='row mb-5'>\r\n" + 
				"          <div class='col-md-4 mb-5'>\r\n" + 
				"            <h3>Sobre nosotros</h3>\r\n" + 
				"            <p class='mb-5'>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatibus et dolor blanditiis consequuntur ex voluptates perspiciatis omnis unde minima expedita.</p>\r\n" + 
				"            <ul class='list-unstyled footer-link d-flex footer-social'>\r\n" + 
				"              <li><a href='#' class='p-2'><span class='fa fa-twitter'></span></a></li>\r\n" + 
				"              <li><a href='#' class='p-2'><span class='fa fa-facebook'></span></a></li>\r\n" + 
				"              <li><a href='#' class='p-2'><span class='fa fa-linkedin'></span></a></li>\r\n" + 
				"              <li><a href='#' class='p-2'><span class='fa fa-instagram'></span></a></li>\r\n" + 
				"            </ul>\r\n" + 
				"\r\n" + 
				"          </div>\r\n" + 
				"          <div class='col-md-5 mb-5'>\r\n" + 
				"            <h3>Contacto</h3>\r\n" + 
				"            <ul class='list-unstyled footer-link'>\r\n" + 
				"              <li class='d-block'>\r\n" + 
				"                <span class='d-block'>Address:</span>\r\n" + 
				"                <span class='text-white'>Alguna calle en Guadalajara, Jalisco, México</span></li>\r\n" + 
				"              <li class='d-block'><span class='d-block'>Telefono:</span><span class='text-white'>+1 242 4942 290</span></li>\r\n" + 
				"              <li class='d-block'><span class='d-block'>Email:</span><span class='text-white'>info@yourdomain.com</span></li>\r\n" + 
				"            </ul>\r\n" + 
				"          </div>\r\n" + 
				"          <div class='col-md-3 mb-5'>\r\n" + 
				"            <h3>Enlaces rapidos:</h3>\r\n" + 
				"            <ul class='list-unstyled footer-link'>\r\n" + 
				"              <li><a href='#'>About</a></li>\r\n" + 
				"              <li><a href='#'>Terminos de use</a></li>\r\n" + 
				"              <li><a href='#'>Disclaimers</a></li>\r\n" + 
				"              <li><a href='#'>Contacto</a></li>\r\n" + 
				"            </ul>\r\n" + 
				"          </div>\r\n" + 
				"          <div class='col-md-3'>\r\n" + 
				"          \r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class='row'>\r\n" + 
				"          <div class='col-12 text-md-center text-left'>\r\n" + 
				"            <p>&copy; <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n" + 
				"Copyright &copy;<script>document.write(new Date().getFullYear());</script> Todos los derechos reservados | Esta plantilla fue hecha con <i class='fa fa-heart-o' aria-hidden='true'></i> by <a href='https://colorlib.com' target='_blank'>Colorlib</a>\r\n" + 
				"<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --> <br> Demo Images Unsplash</p>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </footer>\r\n" + 
				"    <!-- END footer -->\r\n" + 
				"\r\n" + 
				"    <!-- loader -->\r\n" + 
				"    <div id='loader' class='show fullscreen'><svg class='circular' width='48px' height='48px'><circle class='path-bg' cx='24' cy='24' r='22' fill='none' stroke-width='4' stroke='#eeeeee'/><circle class='path' cx='24' cy='24' r='22' fill='none' stroke-width='4' stroke-miterlimit='10' stroke='#f4b214'/></svg></div>\r\n" + 
				"\r\n" + 
				"    <script src='js/jquery-3.2.1.min.js'></script>\r\n" + 
				"    <script src='js/popper.min.js'></script>\r\n" + 
				"    <script src='js/bootstrap.min.js'></script>\r\n" + 
				"    <script src='js/owl.carousel.min.js'></script>\r\n" + 
				"    <script src='js/jquery.waypoints.min.js'></script>\r\n" + 
				"\r\n" + 
				"    <script src='js/jquery.magnific-popup.min.js'></script>\r\n" + 
				"    <script src='js/magnific-popup-options.js'></script>\r\n" + 
				"\r\n" + 
				"    <script src='js/main.js'></script>\r\n" + 
				"  </body>\r\n" + 
				"</html>");	
	}

}
