/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexml;

import com.br.lp3.entities.Aluno;
import com.br.lp3.entities.Endereco;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author 31596861
 */
public class TesteXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File file = new File("C:\\Temp\\alunos.xml");
        XMLManager xmlm = new XMLManager(file);
        List<Aluno> listaAlunos = new ArrayList<>();
      
        for(Aluno a1: listaAlunos){
            System.out.println(a1);
            System.out.println("---");
        }
    }
    
}
