package ProcessClass;

class ProcessBuilderDemo
{
    public static void main(String arg[])
    {
        try
        {
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testfile");
            proc.start();
        } catch (Exception e)
        {
            System.out.println("Error Executing notepad.");
        }    
    }
}
