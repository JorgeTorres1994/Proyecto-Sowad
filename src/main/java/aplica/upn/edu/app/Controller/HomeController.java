package aplica.upn.edu.app.Controller;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aplica.upn.edu.app.model.Desaparecido;
import aplica.upn.edu.app.model.Libro;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String irHome() {
		return "home"; //Retorna el nombre del archivo jsp de la vista
					   //Por lo tanto debemos crear un archivo llamado home.jsp
	}
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		List<Desaparecido> desaparecidos = getLista();
		model.addAttribute("Persona", desaparecidos);
	    return "home";
	}
	
	private List<Desaparecido> getLista(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Desaparecido> lista = null;
		try {
			lista = new LinkedList<>();
			Desaparecido d = new Desaparecido();
			d.setId_desaparecido(1);
			d.setApellidos("Torres Pastor");
			d.setNombres("Jorge Anthony");
			d.setDni("71308475");
			d.setEdad("26");
			d.setFechaNacimiento((Date) formatter.parse("05-09-1994"));
			d.setNacionalidad("Peruana");
			
			Desaparecido d2 = new Desaparecido();
			d2.setId_desaparecido('2');
			d2.setApellidos("Mori Santana");
			d2.setNombres("Wilson");
			d2.setDni("75406019");
			d2.setEdad("23");
			d2.setFechaNacimiento((Date) formatter.parse("12-12-2018"));
			d2.setNacionalidad("Colombiana");
			
			lista.add(d);
			lista.add(d2);
			return lista;
		}
		catch(Exception ex) {
			return null;
		}
		
	}
   /* @RequestMapping(value="/detail")
  public String mostrarDetalle(Model model) {
    	//String Proyecto = "Sistema de Reserva, Prestamos y Devolucion de Libros)";
    	int id_desaparecido = '1';
    	String apellidos = "Torres Pastor";
    	String nombre = "Jorge Anthony";
    	String dni = "71308475";
    	String edad = "26";
    	Date fechaNacimiento = "05-09-1994";

		//model.addAttribute("proyecto", Proyecto);
		model.addAttribute("titulo", titulo);
		model.addAttribute("ISBN", ISBN);
		model.addAttribute("fechaEdicion",fechaEdicion);
		model.addAttribute("autor", autor);
		model.addAttribute("editorial", editorial);
	
		
		
		return "detalle";
    }*/
	
	/*@RequestMapping(value="/",method=RequestMethod.GET)
	public String mostrarPrincipal() {
		return "home"; //Retorna el nombre del archivo jsp de la vista
					   //Por lo tanto debemos crear un archivo llamado home.jsp
	}*/
	
}