public class Menu_FileBuild extends MenuBuild{
    Menu_FileBuild(){
      super("File");
      //add
      add(new MenuItem_NewBuild());
      add(new MenuItem_OpenBuild());
      addSeparator();
      add(new MenuItem_ExitBuild());
    }
}
