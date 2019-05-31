package bean;

import java.util.Date;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import model.Reserva;
import model.Sala;
import model.Usuario;


@ManagedBean
@ApplicationScoped
public class AplicacaoBean {
    
    private List<Usuario> listaUsuarios;
    private List<Sala> listaSalas;
    
    
    
    public void init(){
         Usuario u1 = new Usuario("admin","8488888888", new Date(), "000000000", "admin", "admin", "", true, null);
         Usuario u2 = new Usuario("user","8488888888", new Date(), "000000000", "user", "user", "", true, null);

    }
}
