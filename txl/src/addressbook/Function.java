package addressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
/**
 * ���ܺ���
 */
public class Function {
	
	/*  
     * �޸���ϵ��  
     */  
    public void update(int num,List<Entity> list){  
    	 int numover=0;
    	 boolean flag=false;
         for(Entity e : list){  //��ѯ�Ƿ��д˱��
             if(e.id==num){ 
            	flag=true;
             	break;
             }
             else
             	numover++;
         }
        if(flag==false)  
            System.out.println("���޴��ˣ�");
        else{
        	Scanner scanner = new Scanner(System.in);
            Entity e = new Entity();  
            e.id = num;  
            //�����޸���Ϣ
            System.out.println("��������ϵ��ѧ�ţ�");  
            e.stnumber = scanner.nextLong();  
            System.out.println("��������ϵ��������");
            e.name = scanner.next();  
            System.out.println("���������䣺");  
            e.age = scanner.nextInt();  
            System.out.println("������绰��");  
            e.phone = scanner.nextLong();
            System.out.println("��������ϵ��ַ��");
            e.address = scanner.next();  
            System.out.println("��������ϵ�����䣺");
            e.email = scanner.next();   
            list.set(numover,e);  
        }  
    }  
	
    /*  
     * ɾ����ϵ��  
     */  
	public boolean delete(int num, List<Entity> enlist) {
		 if(num>enlist.size())  
	            return false;  
	        else  
	            enlist.remove(num);  
	        return true;
	}
    
	/*  
     * �����ϵ��  
     */  
    public boolean add(Entity e,List<Entity> list){  
        list.add(e);  
        return true;  
    }  
	/*  
     * ͨ��������ѯָ����ϵ��
     */  
    public Entity selectforname(String name,List<Entity> list){  
        Entity en = null;  
        for(Entity e : list){  
            if(e.name.equals(name))  
                en = e;  
        }  
        return en;  
    }  
    /*  
     * ͨ���绰��ѯָ����ϵ��
     */  
    public Entity selectforphone(long phone, List<Entity> list) {
    	Entity en = null;  
        for(Entity e : list){  
            if(e.phone==phone)  
                en = e;  
        }  
        return en; 
		
	}
	/**
	 * ���ܴ��ݵ�List����,���txt�ļ��ڸ�Ŀ¼��,��������
	 * @param list
	 * @throws IOException
	 */
	public void sava(List<Entity> list) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Administrator\\Desktop\\��ϵ��ͨѶ¼.txt")));//�������,�洢�ļ���D�̸�Ŀ¼��
		 for(Entity e : list){  //��������
			bw.write(e.toString());//д������
			bw.flush();//ˢ���ļ�
			System.out.println("���"+e.name+"..."+"���ݳɹ�");
		 }
		bw.close();//�ر������
		
	}
	


	


	
}
