package it.mulders.mvc;

import jakarta.mvc.Controller;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;


@Controller
@Path("form/show")
public class ShowFormController {

    @GET
    public String showForm() {
        return "input.jsp";
    }
    
}
