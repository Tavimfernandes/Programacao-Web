package aula0909;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTela1Cadastro
 */
@WebServlet("/ServletTela1Cadastro")
public class ServletTela1Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela1Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static final String NOME = "nome";
    public static final String SOBRENOME = "sobrenome";
    public static final String RUA = "rua";
    public static final String COMPLEMENTO = "complemento";
    public static final String CIDADE = "cidade";
    public static final String CEP = "cep";
    public static final String ESTADO = "estado";
    public static final String EMPRESA = "empresa";
    public static final String RUAEMPRESA = "ruaEmpresa";
    public static final String COMPLEMENTOEMPRESA = "complementoEmpresa";
    public static final String CIDADEEMPRESA = "cidadeEmpresa";
    public static final String CEPEMPRESA = "cepEmpresa";
    public static final String ESTADOEMPRESA = "estadoEmpresa";
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html>");
		resposta.write("<head>");
		resposta.write("<title>Dados Profissionais</title>");
		resposta.write("</head>");
		resposta.write("<body>");
		resposta.write("Preencha seus dados profissionais:");
		resposta.write("<form action=\"ServletTela2Cadastro\">");
		
		String nome = request.getParameter(NOME);
		String sobrenome = request.getParameter(SOBRENOME);
		String rua = request.getParameter(RUA);
		String complemento = request.getParameter(COMPLEMENTO);
		String cidade = request.getParameter(CIDADE);
		String cep = request.getParameter(CEP);
		String estado = request.getParameter(ESTADO);
		String empresa = request.getParameter(EMPRESA);
		String ruaEmpresa = request.getParameter(RUAEMPRESA);
		String complementoEmpresa = request.getParameter(COMPLEMENTOEMPRESA);
		String cidadeEmpresa = request.getParameter(CIDADEEMPRESA);
		String cepEmpresa = request.getParameter(CEPEMPRESA);
		String estadoEmpresa = request.getParameter(ESTADOEMPRESA);
		
		HttpSession sessao = request.getSession();
		sessao.setAttribute(NOME, nome);
		sessao.getAttribute(NOME);
		sessao.setAttribute(SOBRENOME, sobrenome);
		sessao.getAttribute(SOBRENOME);
		sessao.setAttribute(RUA, rua);
		sessao.getAttribute(RUA);
		sessao.setAttribute(COMPLEMENTO, complemento);
		sessao.getAttribute(COMPLEMENTO);
		sessao.setAttribute(CIDADE, cidade);
		sessao.getAttribute(CIDADE);
		sessao.setAttribute(CEP, cep);
		sessao.getAttribute(CEP);
		sessao.setAttribute(ESTADO, estado);
		sessao.getAttribute(ESTADO);
		sessao.setAttribute(EMPRESA, empresa);
		sessao.getAttribute(EMPRESA);
		resposta.write("Endereço profissional:<BR>");
		sessao.setAttribute(EMPRESA, empresa);
		sessao.getAttribute(EMPRESA);
		sessao.setAttribute(RUAEMPRESA, ruaEmpresa);
		sessao.getAttribute(RUAEMPRESA);
		sessao.setAttribute(COMPLEMENTOEMPRESA, complementoEmpresa);
		sessao.getAttribute(COMPLEMENTOEMPRESA);
		sessao.setAttribute(CIDADEEMPRESA, cidadeEmpresa);
		sessao.getAttribute(CIDADEEMPRESA);
		sessao.setAttribute(CEPEMPRESA, cepEmpresa);
		sessao.getAttribute(CEPEMPRESA);
		sessao.setAttribute(ESTADOEMPRESA, estadoEmpresa);
		sessao.getAttribute(ESTADOEMPRESA);

		resposta.write("<input type =\"submit\" value=\"Confirmar\"> <BR>");
		resposta.write("</form>");
		resposta.write("</body></html>");
	}

}
