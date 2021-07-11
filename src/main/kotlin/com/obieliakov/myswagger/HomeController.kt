package com.obieliakov.myswagger

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {

  @Value("\${myswagger.api-url}")
  private lateinit var apiURL: String

  @Value("\${myswagger.swagger-url}")
  private lateinit var swaggerURL: String

  @RequestMapping("/")
  fun swaggerRedirect() =
      "redirect:$swaggerURL/swagger-ui/index.html?url=$apiURL/v3/api-docs"

  @RequestMapping("/oauth2-redirect.html")
  fun oauth2Redirect() =
      "redirect:$swaggerURL/swagger-ui/oauth2-redirect.html"

}
