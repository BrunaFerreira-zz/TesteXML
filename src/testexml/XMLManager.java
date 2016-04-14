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
public class XMLManager {
    
    private Document doc;
    
    public XMLManager(File file){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();            
            try {
                Document doc = db.parse(file);
            } catch (SAXException ex) {
                Logger.getLogger(XMLManager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(XMLManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XMLManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Aluno> getAlunos (){
        
        List<Aluno> listaAlunos = new ArrayList<>();
            Element root = doc.getDocumentElement();
            NodeList alunos = root.getElementsByTagName("aluno");
            for(int i=0; i<alunos.getLength();i++){
                Element aluno = (Element)alunos.item(i);
                String tia = aluno.getAttribute("tia");
                
                String nome = aluno.getElementsByTagName("nome").item(0).getTextContent();
                String faculdade = aluno.getElementsByTagName("faculdade").item(0).getTextContent();
                String curso = aluno.getElementsByTagName("curso").item(0).getTextContent();
                int etapa =Integer.parseInt(aluno.getElementsByTagName("etapa").item(0).getTextContent());
                
                Element endereco = (Element) aluno.getElementsByTagName("endereco").item(0);
                Element rua = (Element) aluno.getElementsByTagName("rua").item(0);
                
                String ruastr = rua.getTextContent();
                int numero = Integer.parseInt(rua.getAttribute("numero"));
                
                String complemento = endereco.getElementsByTagName("complemento").item(0).getTextContent();
                String bairro = endereco.getElementsByTagName("bairro").item(0).getTextContent();
                Element cidade = (Element) endereco.getElementsByTagName("cidade").item(0);
                String cidadestr = cidade.getTextContent();
                String estado = cidade.getAttribute("estado");
                
                
                Aluno a = new Aluno(nome,tia,curso,faculdade,etapa,
                        new Endereco(ruastr,numero,complemento,cidadestr,estado)
                );
                
            listaAlunos.add(a);
            }
            return listaAlunos;
}
}

