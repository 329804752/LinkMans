package addressbook;
import java.io.IOException;
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
  
  
public class AddressList {  
    static Scanner scanner = new Scanner(System.in);  
    static List<Entity> enlist = new ArrayList<Entity>();
    static int index=0;
    public static void main(String[] args) {  
        int input;  
        Function fc=new Function();
        AddressList addre = new AddressList();  
        System.out.println("===============��ӭʹ��ͬѧͨѶ¼===============");  
        do{       
            System.out.println("1��������ϵ��");  
            System.out.println("2��ɾ����ϵ��");  
            System.out.println("3���޸���ϵ��");  
            System.out.println("4����ѯ��ϵ��");  
            System.out.println("5����ѯȫ����ϵ��");  
            System.out.println("6�����txt�ļ�");  
            System.out.println("0���˳�ϵͳ");  
            System.out.println("��ѡ��");  
            input = scanner.nextInt();  
            switch(input){  
                case 1:  
                    Entity e = new Entity();  
                    e.id = index++;
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
                    fc.add(e,enlist);  
                    System.out.println("����ɹ���");  
                    break;  
                case 2:  
                	for(Entity entit:enlist){  
                        System.out.println("���:"+entit.id+"---"+entit.toString());
                    } 
                    System.out.println("������Ҫɾ����ϵ�˱�ţ�");  
                    int num = scanner.nextInt();  
                    if(fc.delete(num,enlist))  
                        System.out.println("ɾ���ɹ���");  
                    else  
                        System.out.println("ɾ��ʧ�ܣ���ȷ����Ϣ�Ƿ���ȷ��");  
                    break;  
                case 3:  //�޸���ϵ��
                	for(Entity entit:enlist){  
                        System.out.println("���:"+entit.id+"---"+entit.toString());
                    } 
                    System.out.println("������Ҫ�޸��˱�ţ�"); 
                    int unum = scanner.nextInt();  
                    fc.update(unum,enlist);  
                    System.out.println("�޸���ɣ�");  
                    break;  
                case 4:  //��ѯ��ϰ��
                	System.out.println("�������ѯ��ʽ:"+" 1.ͨ��������ѯ   2.ͨ���绰��ѯ");
                	int choice = scanner.nextInt();
                	switch (choice) {
					case 1:
						System.out.println("������Ҫ��ѯ��������");  
	                    String name = scanner.next();  
	                    Entity ent = fc.selectforname(name,enlist);  
	                    if(ent!=null){  
	                        System.out.println(ent.toString());
	                    }else{  
	                        System.out.println("���޴��ˣ�");  
	                    } 
						break;
					case 2://�ṩ�绰��ѯ��ϵ��
						System.out.println("������Ҫ��ѯ�˵绰��");  
	                    long phone = scanner.nextLong();
	                    Entity ent2 = fc.selectforphone(phone,enlist);
	                    if(ent2!=null){  
	                        System.out.println(ent2.toString());
	                    }else{  
	                        System.out.println("���޴��ˣ�");  
	                    }
						break;

					default:
						System.out.println("������1/2!");
						break;
					}
                	
                    break;  
                case 5:  //��������,��ӡ����
                    for(Entity entit:enlist){  
                        System.out.println(entit.toString());
                    }  
                    break;  
                case 6:  
					try {
						fc.sava(enlist);//������ϵ��
					} catch (IOException e1) {//�׳�IO�쳣
						e1.printStackTrace();
					}
                    break;
            }  
        }while(input!=0);  
        System.out.println("ллʹ�ã�");  
    }    
    
}  
  
