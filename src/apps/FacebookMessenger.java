package apps;

public class FacebookMessenger  extends ServicoMensagemInstantanea{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Envia mensagem pelo Facebook Messenger");
		
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");	
	}
}
