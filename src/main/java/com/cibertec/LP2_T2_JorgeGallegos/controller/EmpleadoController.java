package com.cibertec.LP2_T2_JorgeGallegos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.sql.Date;

import com.cibertec.LP2_T2_JorgeGallegos.models.EmpleadoClass;
import com.cibertec.LP2_T2_JorgeGallegos.repository.AreaRepository;
import com.cibertec.LP2_T2_JorgeGallegos.repository.EmpleadoRepository;


@Controller
public class EmpleadoController {

	@Autowired
	private EmpleadoRepository repo1;
	
	@Autowired
	private AreaRepository repo2;
	
	@GetMapping("/")
	public String lista(Model model) {
		model.addAttribute("empleado",new EmpleadoClass());
		model.addAttribute("lstempleado", repo1.findAll());
		return "ListadoEmpleado";
	}
	
	
	@GetMapping("/registrar")
    public String mostrarFormulario(Model model) {
		model.addAttribute("area",repo2.findAll());
        model.addAttribute("empleado", new EmpleadoClass()); 

        return "RegistrarEmpleado"; 
    }
	
	 @GetMapping("/eliminar/{dni}")
	    public String eliminarEmpleado(@PathVariable("dni") String dni, RedirectAttributes redirectAttributes) {
	        repo1.deleteById(dni);
	        return "redirect:/";
	    }
	 
	 
	 @PostMapping("/guardarEmpleado")
	    public String guardarEmpleado(@ModelAttribute EmpleadoClass empleado, Model model) {
	        repo1.save(empleado);
	        return "redirect:/";
	    }
	 
	 
	 @GetMapping("/editar/{dni}")
	 public String EditarEmpleado(@PathVariable("dni") String dni, Model model) {
	     EmpleadoClass empleado = repo1.findById(dni).orElse(null);
	     model.addAttribute("empleado", empleado);
	     model.addAttribute("area", repo2.findAll());
	     return "EditarEmpleado";
	 }
}
