package activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * ��Ϣ����
 * @author Administrator
 *
 */
public class Listener implements MessageListener{

	@Override
	
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		try {
			System.out.println("�յ�����ϢonListen��"+((TextMessage)message).getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
