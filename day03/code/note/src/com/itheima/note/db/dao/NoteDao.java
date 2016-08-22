package com.itheima.note.db.dao;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.itheima.note.db.NoteSQLiteOpenHelper;
import com.itheima.note.domain.NoteBean;

/**
 * ���˱���dao
 * 
 * @author Administrator
 * 
 */
public class NoteDao {
	// ��Ϊ �κ�һ������������Ҫ �õ� NoteSQLiteOpenHelper helper
	// �������ڹ��췽�������ʼ��
	private NoteSQLiteOpenHelper helper;

	public NoteDao(Context context) {
		helper = new NoteSQLiteOpenHelper(context);
	}

	/**
	 * ���һ����Ŀ��Ϣ �����ݿ�
	 * 
	 * @param name
	 *            ����������
	 * @param money
	 *            ���
	 */
	public void add(String name, float money) {
		SQLiteDatabase db = helper.getWritableDatabase();
		db.execSQL("insert into account (name,money) values (?,?)",
				new Object[] { name, money });
		// ��ס �ر�.
		db.close();
	}



	public void delete(int id) {
		SQLiteDatabase db = helper.getWritableDatabase();
		db.execSQL("delete from account where id=?", new Object[] { id });
		db.close();
	}

	public void update(int id, float newmoney) {
		SQLiteDatabase db = helper.getWritableDatabase();
		db.execSQL("update account set money =? where id=?", new Object[] {
				newmoney, id });
		db.close();
	}

	    db.execSQL("insert into radiomap(location,ap1,ap2) select 'x=1,y=1',-80,-73 " +  
                "union all select 'x=2,y=3',80,40 union all select 'x=3,y=5',30,20 "+  
                   "union all select 'x=4,y=5',3,2 union all select 'x=30,y=50',30,20 union all select 'x=3,y=5',40,20"  
                +" union all select 'x=3,y=5',6,20 union all select 'x=3,y=5',6,7 union all select 'x=3,y=5',7,8 union all select 'x=3,y=5',8,9 union all select 'x=3,y=5',9,9" +  
                        " union all select 'x=3,y=5',3,5 union all select 'x=3,y=5',7,20 union all select 'x=3,y=5',4,20 union all select 'x=3,y=5',5,20 union all select 'x=3,y=5',6,20" +  
                        " union all select 'x=3,y=5',3,6 union all select 'x=3,y=5',7,7 union all select 'x=3,y=5',3,8 union all select 'x=3,y=5',8,2");  
           long b=System.currentTimeMillis();  
           long c=b-a;  
           Log.i("LocationActivity", String.valueOf(c));  
             
           a=System.currentTimeMillis();  
           db.beginTransaction();  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',2,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',4,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',6,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',2,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',4,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',6,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',1,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',1,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',1,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',2,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',2,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',2,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',3,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',3,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',3,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',4,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=7',5,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',4,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',5,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',5,5)");  
           db.setTransactionSuccessful();  
           db.endTransaction();  
           b=System.currentTimeMillis();  
           Log.i("LocationActivity", String.valueOf(b-a));  
              
           a=System.currentTimeMillis();  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=7,y=8',7,8)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=8,y=9',8,9)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=9,y=10',9,10)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',2,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',4,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',6,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',2,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',2,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',2,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',3,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',3,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',3,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',4,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',4,4)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',4,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',5,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=7',6,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',5,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',6,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',6,5)");  
           b=System.currentTimeMillis();  
           Log.i("LocationActivity", String.valueOf(b-a));  
        }  

��һ�ַ�ʽ����

insert into ����(����1,����2)    
 select  ֵ1,ֵ2
 union all 
 select ֵ1,ֵ2  
 union all 
 select ֵ1,ֵ2 

�������ַ�ʽ���Խ����������Ч�ʣ�

��һ�ַ�ʽΪ9ms

�������Ϊ��86ms

������ֱ����insert�����Ϊ��29ms

������Ϊ���β�������20�����ݣ�����������ķ����Ȳ��õĿ�����ʱ�䳤����1000�����������Կ���ֱ����insert����ġ�
���� 0

    ��һƪandroid�������ܽ�
    ��һƪAndroid����ָ��-����С������App Widgets��

��
    0

��
    0

�����Ƽ�
    ���ݿ� sqlite android android���� ���� 

��������
    Eclipse ��װ ADT ����~��װϵͳ�и�~
    iOS�������ʵ����Ϣ���ͻ���
    javascript ֻ�������������ܽ�
    5����������ߵ��Դ�����վ
    �ٶȵ�ͼapi---ʵ���½���ͼ
    ListView��item progressbar��ʾ���ҵ�����
    Android�е��̻߳��ƣ�Handler Looper��������
    android ʵ��͸����ť
    ȥ�� android dialog ��ɫ�߿�
    Android��Ŀ�ϲ�

�鿴����

3¥ LeungYong 2013-01-05 10:19���� [�ظ�]
    ò��ʵ�ֲ���

2¥ minggoddess 2012-05-25 22:49���� [�ظ�]
    Ŷ ������ �������� ��begintranction���Ǹ���

Re: android_qhdxuan 2012-06-05 11:08���� [�ظ�]
    �ظ�minggoddess�������ǵģ�������˼���һ��ʱ��һֱ û����CSDN���տ���������ԣ���

1¥ minggoddess 2012-05-25 22:48���� [�ظ�]
    ������������Ķ��������� ����ôֻ����insert��

����û�е�¼,��[��¼]��[ע��]
* �����û�����ֻ��������˹۵㣬������CSDN��վ�Ĺ۵������
TOP
���ļ�����Ŀ
ȫ������ Java VPN Android iOS ERP IE10 Eclipse CRM JavaScript Ubuntu NFC WAP jQuery ���ݿ� BI HTML5 Spring Apache Hadoop .NET API HTML SDK IIS Fedora XML LBS Unity Splashtop UML components Windows Mobile Rails QEMU KDE Cassandra CloudStack FTC coremail OPhone CouchBase �Ƽ��� iOS6 Rackspace Web App SpringSide Maemo Compuware ������ aptech Perl Tornado Ruby Hibernate ThinkPHP Spark HBase Pure Solr Angular Cloud Foundry Redis Scala Django Bootstrap

    ��������

    [�����ҵĿռ�]
    android_qhdxuan
        ���ʣ�32108��
        ���֣�440��
        ������ǧ��֮��
        ԭ����10ƪ
        ת�أ�10ƪ
        ���ģ�0ƪ
        ���ۣ�14��

    about me

    ��ɽ��ѧ ��������������˶ʿ�о��� 

    ��������

    ���·���

    Android���(15)
    JAVA����(3)
    Linux���(1)
    �㷨(1)

    ���´浵

    2012��06��(1)
    2012��04��(2)
    2012��03��(5)
    2011��12��(4)
    2011��11��(8)

    �Ķ����� 

    Ubuntu������л��������û���root������VMware�������Linux�������ն�֮���л��ķ���(8629)
    Android wifi �ź�ǿ�ȵ�λ dbm(5417)
    Android ���򴫸���������ƺͼ��ٶȴ�����֮��Ĺ�ϵ(4970)
    android��SQLite���ݿ�����insertͬʱ���������¼�ķ�����Ч�ʱȽ�(3916)
    Android�е��̻߳���(2189)
    ����������(1076)
    Android�е��̻߳��ƣ�Handler Looper��������(860)
    Java��ļ��أ����Ӻ����й���(847)
    android ����΢���ͻ��˵ı��鹦�ܵ�ʵ��(598)
    ��javap �������������i=i++����(521)

    ��������

    android��SQLite���ݿ�����insertͬʱ���������¼�ķ�����Ч�ʱȽ�(4)
    Android ���򴫸���������ƺͼ��ٶȴ�����֮��Ĺ�ϵ(4)
    Android wifi �ź�ǿ�ȵ�λ dbm(3)
    Android�е��̻߳��ƣ�Handler Looper��������(2)
    Ubuntu������л��������û���root������VMware�������Linux�������ն�֮���л��ķ���(1)
    �ٶ�Android����������(0)
    Android����ָ��-����С������App Widgets��(0)
    android ����΢���ͻ��˵ı��鹦�ܵ�ʵ��(0)
    ����������(0)
    ��javap �������������i=i++����(0)

    �Ƽ�����

    ��������

    Android ���򴫸���������ƺͼ��ٶȴ�����֮��Ĺ�ϵ

    lyz25: �����ֻ��дų���Ӧ�������Ǽ�ⲻ���仯����û����SensorManager.getRotationM...
    Android ���򴫸���������ƺͼ��ٶȴ�����֮��Ĺ�ϵ

    guanting207: ���� ��ⲻ���ų���Ӧ����ʲôԭ����
    Android ���򴫸���������ƺͼ��ٶȴ�����֮��Ĺ�ϵ

    liuxxyy: лл�����������ĸ��Ƕ����ֻ���ֹʱ���ڲ���ı仯��������ֵ�仯���ܴ�����ô���������
    Android wifi �ź�ǿ�ȵ�λ dbm

    sunnykaby: �� wifimanager.startScan()wifimanager.getScanReasul...
    Android wifi �ź�ǿ�ȵ�λ dbm

    luxj: �� wifimanager.startScan()wifimanager.getScanReasul...
    Android wifi �ź�ǿ�ȵ�λ dbm

    wpweng: �ʸ����⣬��Ϊʲôwifi�ź�ǿ��ֵΪ��ֵ�������������-20dBm���ǰ����㹫ʽ������Ĺ�����0....
    Android ���򴫸���������ƺͼ��ٶȴ�����֮��Ĺ�ϵ

    sailaway: ����˺ܶ�Ĳ��⣬лл���������²���remapCoordinateSystem���������ôʹ�ã��ǲ�...
    android��SQLite���ݿ�����insertͬʱ���������¼�ķ�����Ч�ʱȽ�

    LeungYong: ò��ʵ�ֲ���
    Android�е��̻߳��ƣ�Handler Looper��������

    joycean: handler=new Handler(thread.getLooper());thread.sta...
    android��SQLite���ݿ�����insertͬʱ���������¼�ķ�����Ч�ʱȽ�

    android_qhdxuan: @minggoddess:�����ǵģ�������˼���һ��ʱ��һֱ û����CSDN���տ���������ԣ���



	/**
	 * �������ݿ����е���Ŀ
	 * 
	 * @return
	 */
	public List<NoteBean> findAll() {
		// �õ��ɶ������ݿ�
		SQLiteDatabase db = helper.getReadableDatabase();
		List<NoteBean> noteBeans = new ArrayList<NoteBean>();
		// ��ȡ�����ݿ��ѯ�Ľ���α�
		Cursor cursor = db.rawQuery("select id,money,name from account ", null);
		while (cursor.moveToNext()) {
			int id = cursor.getInt(cursor.getColumnIndex("id"));
			String name = cursor.getString(cursor.getColumnIndex("name"));
			float money = cursor.getFloat(cursor.getColumnIndex("money"));
			NoteBean bean = new NoteBean(id, money, name);
			noteBeans.add(bean);
			bean = null;
		}

		db.close();
		return noteBeans;
	}

	/**
	 * ģ��һ��ת�˵Ĳ���. ʹ�����ݿ������
	 * 
	 * @throws Exception
	 */
	public void testTransaction() throws Exception {
		// �õ���д�����ݿ�
		SQLiteDatabase db = helper.getWritableDatabase();
		db.beginTransaction(); // ��ʼ����
		try {
			db.execSQL("update account set money = money - 5 where id=? ",
					new String[] { "2" });
			db.execSQL("update account set money = money + 5 where id=? ",
					new String[] { "3" });
			db.setTransactionSuccessful();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			db.endTransaction();//�ر�����.
			db.close();
		}

	}

}
