class CelciusToFahrenheit
{
    double celcius;
    void convert()
    {
        double fahrenheit=(celcius*9/5)+32;
        System.out.println("Temperature in fahrenheit="+fahrenheit);
    }
    public static void main(String[] args) {
        CelciusToFahrenheit obj=new CelciusToFahrenheit();
        obj.celcius=37;
        obj.convert();
    }
}