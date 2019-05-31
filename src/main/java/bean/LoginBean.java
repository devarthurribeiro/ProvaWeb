package bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import model.Usuario;

@ManagedBean(name = "loginBean") 
public class LoginBean {

    private List<Usuario> listaUsuarios;

    private String login;
    private String senha;

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void autenticar() {
        System.out.println("autenticar");
    }

}
