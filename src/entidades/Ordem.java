package entidades;

import java.util.Date;

import entidades.enums.OrdemStatus;

public class Ordem {

	private int id;
	private Date data;
	private OrdemStatus status;
	
	public Ordem() {
		
	}

	public Ordem(int id, Date data, OrdemStatus status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ordem [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
	
	

}
