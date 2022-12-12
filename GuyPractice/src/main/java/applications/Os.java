package applications;

import java.util.Arrays;
import java.util.Objects;

public class Os {
    private int id;
    private static int latestId;
    private String name;
    private Application[] apps;
    private int storageSize;
    private int usedStorage;
    private int count;

    public Os(String name, int storageSize){
        this.id = latestId++;
        this.name = name;
        this.storageSize = storageSize;
        apps = new Application[5];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Application[] getApps() {
        return apps;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public int getUsedStorage() {
        return usedStorage;
    }

    public boolean addApplication(Application newApp){
        if (newApp.getSize() > this.getStorageSize()) return false;
        if (newApp.getSize() <= this.getStorageSize()){
            apps[count++] = newApp;
            if (count == apps.length){
                Application[] appsCopy = new Application[count+5];
                for (int i = 0 ; i < apps.length ; i++){
                    appsCopy[i] = apps[i];
                }
                apps = appsCopy;
            }
            this.storageSize -= newApp.getSize();
            this.usedStorage += newApp.getSize();
            return true;
        }
        return false;
    }

    public void removeApplication(int id){
        if (id <= apps.length){
            int k =0;
            Application[] appc; //app clone and don't keep remove apps.
            appc = new Application[apps.length];
            for (int i = 0 ; i < apps.length ; i++){
                if (apps[i].getId() != id){ //when apps != id, keep that to new array
                    appc[k] = apps[i];
                    k++;
                }
            }
            apps = appc;
        }
    }

    public int getApplicationIdByName(String name){
        for (int i = 0 ; i < apps.length ; i++){
            if (apps[i].getName().equals(name)){
                return apps[i].getId();
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Os{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", apps=" + Arrays.toString(apps) +
                ", storageSize=" + storageSize +
                ", usedStorage=" + usedStorage +
                ", count=" + count +
                "} \n";
    }
}
