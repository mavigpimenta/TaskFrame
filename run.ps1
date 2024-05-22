if ((ls | ? { $_.Name -eq "bin" }).Count -eq 0) {
  mkdir bin
}

C:\Users\disrct\Desktop\java-1.8.0-openjdk\bin\javac.exe App.java -d bin
ls | ? { $_.Name.EndsWith(".fxml") } | % { cp $_ bin } 

clear 
cd bin 
C:\Users\disrct\Desktop\java-1.8.0-openjdk\bin\java.exe App 
cd ..
