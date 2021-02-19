
package Modelo;


import java.util.Date;

public class Modelo {
    //Campos de la tabla Registro Cliente//
    private int id_Cliente;
    private String Cliente_Nombre;
    private String Cliente_Apellido;
    private String Cliente_Telefono;
    private String Cliente_Correo;
    private String Cliente_Descripción_Rregistro;
    //**Campos de la tabla vendedores**//
    private int id_Vendedor;
    private String Vendedor_nombre;
    private String Vendedor_Apellido;
    private float Vendedor_Comision;
    private int Vendedor_Sucursal_id;
    private Date Fecha_de_Contrato;
    //**Campos de la tabla Oportunidad//
    private int id_Oportunidad;
    private String Oportunidad;
    //**Campos de la tabla evento**//
    private int Id_Eventos;
    private int Eventos_Tipo_Id;
    private Date Evento_Fecha;
    private int  Evento_Cantidad_Asistentes;
    private int Evento_Menu_Id;
    private int Evento_Local_Id;
    //**Tabla Tipo_Evento**//
    private int Id_Evento;
    private String Tipo_Evento;
    //**menu Evento**//
    private int Id_Menu;
    private String Menu_Evento_Nombre;
    private String Menu_Evento_Descripcion;
    private float Menu_Evento_Precio;
    //**Local**//
    private int Id_Local;
    private String Local_Nombre;
    private String Local_Sillas;
    private String Local_Mesas;
    //**Tabla Venta_Cliente//
    private int Id_Venta_Cliente;
    private int Venta_Id;
    private int Venta_Registro_Id;
    private float Venta_Costo_Total;
    //**Inicio de getter y Setters**//

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getCliente_Nombre() {
        return Cliente_Nombre;
    }

    public void setCliente_Nombre(String Cliente_Nombre) {
        this.Cliente_Nombre = Cliente_Nombre;
    }

    public String getCliente_Apellido() {
        return Cliente_Apellido;
    }

    public void setCliente_Apellido(String Cliente_Apellido) {
        this.Cliente_Apellido = Cliente_Apellido;
    }

    public String getCliente_Telefono() {
        return Cliente_Telefono;
    }

    public void setCliente_Telefono(String Cliente_Telefono) {
        this.Cliente_Telefono = Cliente_Telefono;
    }

    public String getCliente_Correo() {
        return Cliente_Correo;
    }

    public void setCliente_Correo(String Cliente_Correo) {
        this.Cliente_Correo = Cliente_Correo;
    }

    public String getCliente_Descripción_Rregistro() {
        return Cliente_Descripción_Rregistro;
    }

    public void setCliente_Descripción_Rregistro(String Cliente_Descripción_Rregistro) {
        this.Cliente_Descripción_Rregistro = Cliente_Descripción_Rregistro;
    }

    public int getId_Vendedor() {
        return id_Vendedor;
    }

    public void setId_Vendedor(int id_Vendedor) {
        this.id_Vendedor = id_Vendedor;
    }

    public String getVendedor_nombre() {
        return Vendedor_nombre;
    }

    public void setVendedor_nombre(String Vendedor_nombre) {
        this.Vendedor_nombre = Vendedor_nombre;
    }

    public String getVendedor_Apellido() {
        return Vendedor_Apellido;
    }

    public void setVendedor_Apellido(String Vendedor_Apellido) {
        this.Vendedor_Apellido = Vendedor_Apellido;
    }

    public float getVendedor_Comision() {
        return Vendedor_Comision;
    }

    public void setVendedor_Comision(float Vendedor_Comision) {
        this.Vendedor_Comision = Vendedor_Comision;
    }

    public int getVendedor_Sucursal_id() {
        return Vendedor_Sucursal_id;
    }

    public void setVendedor_Sucursal_id(int Vendedor_Sucursal_id) {
        this.Vendedor_Sucursal_id = Vendedor_Sucursal_id;
    }

    public Date getFecha_de_Contrato() {
        return Fecha_de_Contrato;
    }

    public void setFecha_de_Contrato(Date Fecha_de_Contrato) {
        this.Fecha_de_Contrato = Fecha_de_Contrato;
    }

    public int getId_Oportunidad() {
        return id_Oportunidad;
    }

    public void setId_Oportunidad(int id_Oportunidad) {
        this.id_Oportunidad = id_Oportunidad;
    }

    public String getOportunidad() {
        return Oportunidad;
    }

    public void setOportunidad(String Oportunidad) {
        this.Oportunidad = Oportunidad;
    }

    public int getId_Eventos() {
        return Id_Eventos;
    }

    public void setId_Eventos(int Id_Eventos) {
        this.Id_Eventos = Id_Eventos;
    }

    public int getEventos_Tipo_Id() {
        return Eventos_Tipo_Id;
    }

    public void setEventos_Tipo_Id(int Eventos_Tipo_Id) {
        this.Eventos_Tipo_Id = Eventos_Tipo_Id;
    }

    public Date getEvento_Fecha() {
        return Evento_Fecha;
    }

    public void setEvento_Fecha(Date Evento_Fecha) {
        this.Evento_Fecha = Evento_Fecha;
    }

    public int getEvento_Cantidad_Asistentes() {
        return Evento_Cantidad_Asistentes;
    }

    public void setEvento_Cantidad_Asistentes(int Evento_Cantidad_Asistentes) {
        this.Evento_Cantidad_Asistentes = Evento_Cantidad_Asistentes;
    }

    public int getEvento_Menu_Id() {
        return Evento_Menu_Id;
    }

    public void setEvento_Menu_Id(int Evento_Menu_Id) {
        this.Evento_Menu_Id = Evento_Menu_Id;
    }

    public int getEvento_Local_Id() {
        return Evento_Local_Id;
    }

    public void setEvento_Local_Id(int Evento_Local_Id) {
        this.Evento_Local_Id = Evento_Local_Id;
    }

    public int getId_Evento() {
        return Id_Evento;
    }

    public void setId_Evento(int Id_Evento) {
        this.Id_Evento = Id_Evento;
    }

    public String getTipo_Evento() {
        return Tipo_Evento;
    }

    public void setTipo_Evento(String Tipo_Evento) {
        this.Tipo_Evento = Tipo_Evento;
    }

    public int getId_Menu() {
        return Id_Menu;
    }

    public void setId_Menu(int Id_Menu) {
        this.Id_Menu = Id_Menu;
    }

    public String getMenu_Evento_Nombre() {
        return Menu_Evento_Nombre;
    }

    public void setMenu_Evento_Nombre(String Menu_Evento_Nombre) {
        this.Menu_Evento_Nombre = Menu_Evento_Nombre;
    }

    public String getMenu_Evento_Descripcion() {
        return Menu_Evento_Descripcion;
    }

    public void setMenu_Evento_Descripcion(String Menu_Evento_Descripcion) {
        this.Menu_Evento_Descripcion = Menu_Evento_Descripcion;
    }

    public float getMenu_Evento_Precio() {
        return Menu_Evento_Precio;
    }

    public void setMenu_Evento_Precio(float Menu_Evento_Precio) {
        this.Menu_Evento_Precio = Menu_Evento_Precio;
    }

    public int getId_Local() {
        return Id_Local;
    }

    public void setId_Local(int Id_Local) {
        this.Id_Local = Id_Local;
    }

    public String getLocal_Nombre() {
        return Local_Nombre;
    }

    public void setLocal_Nombre(String Local_Nombre) {
        this.Local_Nombre = Local_Nombre;
    }

    public String getLocal_Sillas() {
        return Local_Sillas;
    }

    public void setLocal_Sillas(String Local_Sillas) {
        this.Local_Sillas = Local_Sillas;
    }

    public String getLocal_Mesas() {
        return Local_Mesas;
    }

    public void setLocal_Mesas(String Local_Mesas) {
        this.Local_Mesas = Local_Mesas;
    }

    public int getId_Venta_Cliente() {
        return Id_Venta_Cliente;
    }

    public void setId_Venta_Cliente(int Id_Venta_Cliente) {
        this.Id_Venta_Cliente = Id_Venta_Cliente;
    }

    public int getVenta_Id() {
        return Venta_Id;
    }

    public void setVenta_Id(int Venta_Id) {
        this.Venta_Id = Venta_Id;
    }

    public int getVenta_Registro_Id() {
        return Venta_Registro_Id;
    }

    public void setVenta_Registro_Id(int Venta_Registro_Id) {
        this.Venta_Registro_Id = Venta_Registro_Id;
    }

    public float getVenta_Costo_Total() {
        return Venta_Costo_Total;
    }

    public void setVenta_Costo_Total(float Venta_Costo_Total) {
        this.Venta_Costo_Total = Venta_Costo_Total;
    }
    
}
