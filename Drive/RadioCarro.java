public class RadioCarro implements Radio {
	private boolean nEstado;
	private int banda;
	private boolean ud;
	private int pos;
	public void setEstado(boolean nEstado){
		this.nEstado=nEstado;
	}
    
    public boolean getEstado(){
    	return nEstado;

    }
    
    public void setAMFM(int banda){
    	this.banda=banda;
    }

    public int getAMFM(){
    	return banda;
    }
    
    public void sintonizar(boolean ud){

    }
    
    public void guardar(int pos){

    }
    
    public void memoria(int pos){

    }
    
   	public float getEmisora(){
   		return banda;//ESTO NO VA ASI, HAY QUE CAMBIARLO
    }
}