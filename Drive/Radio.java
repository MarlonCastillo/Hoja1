public interface Radio{

    public void setEstado(boolean nEstado);
    
    public boolean getEstado();
    
    public int getAMFM();
    
    public void setAMFM(int banda);
    
    public void sintonizar(boolean ud);
    
    public void guardar(int pos);
    
    public void memoria(int pos);
    
    public float getEmisora();

}