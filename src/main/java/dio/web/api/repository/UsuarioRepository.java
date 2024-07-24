package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE");
        else
            System.out.println("UPDATE");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("emerson", "password"));
        usuarios.add(new Usuario("jessika", "masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND BY ID", id));
        return new Usuario("emerson", "password");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND BY USERNAME", username));
        return new Usuario("emerson","password");
    }

}
