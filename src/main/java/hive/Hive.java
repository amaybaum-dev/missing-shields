package hive;

import org.apache.hadoop.hive.metastore.HiveMetaStore;

public class Hive {

  public void hive() {
    HiveMetaStore hiveMetaStore = new HiveMetaStore();
    System.out.println(hiveMetaStore);
  }

}
