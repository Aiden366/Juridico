/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanramongonzalez.juridico36;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author juanr
 */
public class PrincipalController {
    @FXML
    public TableView<Demanda> demandas;
    @FXML
    public TableColumn<Demanda, String> numero;
    @FXML
    public TableColumn<Demanda, String> fecha;
    @FXML
    public TableColumn<Demanda, String> juzgado;
    @FXML
    public TableColumn<Demanda, String> expediente;
    @FXML
    public TableColumn<Demanda, String> mesa;
    @FXML
    public TableColumn<Demanda, String> administrador;
    @FXML
    public TableColumn<Demanda, String> actor;
    @FXML
    public TableColumn<Demanda, String> nombramiento;
    @FXML
    public TableColumn<Demanda, String> area;
    @FXML
    public TableColumn<Demanda, String> asunto;
    @FXML
    public TableColumn<Demanda, String> estadoProcesal;
    @FXML
    public TableColumn<Demanda, String> amparos;
    
    
     @FXML
    private void switchSalir() throws IOException {
        App.setRoot("primary");
    }
     @FXML
    private void switchAbogados() throws IOException {
        App.setRoot("secondary");
    }
     @FXML
    private void switchClientes() throws IOException {
        App.setRoot("terciary");
    }
    @FXML
    private void switchNotas() throws IOException{
        App.setRoot("Notas");
    }
    @FXML
    private void switchConsulAbogados() throws IOException{
        App.setRoot("aboagdo");
    }
    
     public void initialize() {
        numero.setCellValueFactory(new PropertyValueFactory<>("numero"));
        fecha.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        juzgado.setCellValueFactory(new PropertyValueFactory<>("juzgado"));
        expediente.setCellValueFactory(new PropertyValueFactory<>("expediente"));
        mesa.setCellValueFactory(new PropertyValueFactory<>("mesa"));
        administrador.setCellValueFactory(new PropertyValueFactory<>("administrador"));
        actor.setCellValueFactory(new PropertyValueFactory<>("actor"));
        nombramiento.setCellValueFactory(new PropertyValueFactory<>("nombramiento"));
        area.setCellValueFactory(new PropertyValueFactory<>("area"));
        asunto.setCellValueFactory(new PropertyValueFactory<>("asunto"));
        estadoProcesal.setCellValueFactory(new PropertyValueFactory<>("estadoProcesal"));
        amparos.setCellValueFactory(new PropertyValueFactory<>("amparos"));
        
        
        // Crear una lista de datos
        ObservableList<Demanda> data = FXCollections.observableArrayList(
            new Demanda("142", " "," ","2989/2018","B","Moisés Anaya Aguílar","Julio Alberto Raygoza Villanueva.","Bombero-Paramédico.","Bombero-Rescatista."," "," "," ")
            
        );

        // Añadir los datos a la tabla
        demandas.setItems(data);
    }
    
    
    public class Demanda {
    public String numero;
    public String fecha;
    public String juzgado;
    public String expediente;
    public String mesa;
    public String administrador;
    public String actor;
    public String nombramiento;
    public String area;
    public String asunto;
    public String estadoProcesal;
    public String amparos;

    public Demanda(String numero, String fecha, String juzgado, String expediente, String mesa, String administrador, String actor,
    String nombramiento, String area, String asunto, String estadoProcesal,String amparos) {
        this.numero = numero;
        this.fecha = fecha;
        this.juzgado = juzgado;
        this.expediente = expediente;
        this.mesa = mesa;
        this.administrador = administrador;
        this.actor = actor;
        this.nombramiento = nombramiento;
        this.area = area;
        this.asunto = asunto;
        this.estadoProcesal = estadoProcesal;
        this.amparos = amparos;
    }

        public String getNumero() {
            return numero;
        }

        public String getFecha() {
            return fecha;
        }

        public String getJuzgado() {
            return juzgado;
        }

        public String getExpediente() {
            return expediente;
        }

        public String getMesa() {
            return mesa;
        }

        public String getAdministrador() {
            return administrador;
        }

        public String getActor() {
            return actor;
        }

        public String getNombramiento() {
            return nombramiento;
        }

        public String getArea() {
            return area;
        }

        public String getAsunto() {
            return asunto;
        }

        public String getEstadoProcesal() {
            return estadoProcesal;
        }

        public String getAmparos() {
            return amparos;
        }
    

}
    
}
