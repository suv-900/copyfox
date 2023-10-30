package copyfox;

class Node{
    private byte[] dataStore;
    private Node nextNode;
    private int dataStart;
    private int dataEnd;
    
    Node(){
        this.dataStore=new byte[100];
        this.nextNode=null;
        this.dataStart=0;
        this.dataEnd=0;
    }

    void storeDataInNode(byte[] foreignData,int offset){
        int foreignDataLength=foreignData.length;
        
        int k=offset;
        int i=0;
        this.dataStart=0;

        while(i<100&&k<foreignDataLength){
            this.dataStore[i]=foreignData[k];
            i++;k++;
        }
        i=this.dataEnd;

        if(k<foreignDataLength-1){
            this.nextNode=new Node();
            this.nextNode.storeDataInNode(foreignData,k);
        }
        
    }

    byte[] getDataFromNode(){}
}

//store in bytes and send back data 
public class BufferStore {
    private Node rootNode;
    
    void storeData(){
        if(this.rootNode==null){
            rootNode=new Node();
        }


    }
}
