package copyfox;

class Node{
    private byte[] dataStore;
    private Node nextNode;
    Node(){
        this.dataStore=new byte[100];
        this.nextNode=null;
    }

    void storeData(byte[] foreignData,int offset){
        int foreignDataLength=foreignData.length;
        int i; 
        for(i=0;i<100&&i<foreignDataLength;i++){
            this.dataStore[i]=foreignData[i]; 
        }
        int j,k=i;

        if(k<foreignDataLength-1){
            //more foreign data
            this.nextNode=new Node();
            this.nextNode.storeData(foreignData,k);
        }
    }
}

//store in bytes and send back data 
public class BufferStore {
    
}
