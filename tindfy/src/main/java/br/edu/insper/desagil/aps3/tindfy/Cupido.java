package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Cupido {
    private Map<Integer, List<Integer>> likes;

    public Cupido(Map<Integer, List<Integer>> likes) {
        this.likes = likes;
    }

    public void deuLike(int deu_Like, int recebeu_like){

        if (likes.isEmpty()){
            List<Integer> lista = new ArrayList<>();
            lista.add(recebeu_like);
            likes.put(deu_Like,lista);
        }
        if (likes.containsKey(deu_Like)){
            List<Integer> lista;
            lista = likes.get(deu_Like);

            if (!lista.contains(recebeu_like)){
                lista.add(recebeu_like);
            }

        }
        else{
            List<Integer> lista = new ArrayList<>();
            lista.add(recebeu_like);
            likes.put(deu_Like,lista);
        }
    }

    public Boolean deuMatch(Usuario usuario1, Usuario usuario2){
        if (likes.isEmpty()){return false;}
        else if (likes.get(usuario1.getId()).isEmpty()){return false;}
        else if (likes.get(usuario2.getId()).isEmpty()){return false;}


        else if (likes.get(usuario1.getId()).contains(usuario2.getId()) & likes.get(usuario2.getId()).contains(usuario1.getId())){
            return true;
        }
        else{
            return  false;
        }

    }





}
