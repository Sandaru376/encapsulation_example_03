class rectangle{
    private Double length;
    private Double width;

    public Double getlength(){
        return length;
    }

    public void setlength(Double Length){
        length=Length;
    }

    
    public Double getwidth(){
        return width;
    }

    public void setwidth(Double Width){
        width=Width;
    }
    public static void main(String[] args) {
        rectangle obj=new rectangle();

        obj.setlength(20.0);
        obj.setwidth(12.0);
        
        Double length=obj.getlength();
        Double width=obj.getwidth();

        System.out.println("length is :"+ length);
        System.out.println("width is :" + width);
    }
}