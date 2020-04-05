class dictionaryinjava{

public void main (String [] args){
    Map<String, Label> map = new HashMap<String, Label>();
    for ( String key : map.keySet() ) {
       //for singles keys onlya
    }
    for ( Label value : map.values() ) {
       //for singles value
    }
    for ( Map.Entry<String, Label> entry : map.entrySet() ) {
        //for keys and values
        String key = entry.getKey();
        Label value = entry.getValue();
    }
  }

}
