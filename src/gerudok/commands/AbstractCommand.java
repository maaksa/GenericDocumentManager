package gerudok.commands;
//komanda
//deklarise interfejs za izvrsavanje operacija
public abstract class AbstractCommand {

    public abstract void doCommand();
    public abstract void undoCommand();
}
