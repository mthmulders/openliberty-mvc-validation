package it.mulders.mvc;

import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.Models;
import jakarta.mvc.binding.BindingResult;
import jakarta.mvc.binding.MvcBinding;
import jakarta.validation.constraints.Min;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Controller
@Path("form/process")
public class ProcessFormController {
    @MvcBinding
    @FormParam("age")
    @Min(18)
    private int age;

    @Inject
    private BindingResult bindingResult;

    @Inject
    private Models models;

    @POST
    public String processForm() {
        if(bindingResult.isFailed()) {
            System.out.println("Form invalid");
            models.put("errors", bindingResult.getAllMessages());
        } else {
            System.out.println("Form valid");
        }

        // process the form request
        return "hello.jsp";
    }
}
