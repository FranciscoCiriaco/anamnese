package br.com.anamnese.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class FichaAnamnese {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    /* Dados Pessoais */
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public boolean isCostumaIrAoPodologo() {
        return costumaIrAoPodologo;
    }

    public void setCostumaIrAoPodologo(boolean costumaIrAoPodologo) {
        this.costumaIrAoPodologo = costumaIrAoPodologo;
    }

    public String getFrequenciaPodologo() {
        return frequenciaPodologo;
    }

    public void setFrequenciaPodologo(String frequenciaPodologo) {
        this.frequenciaPodologo = frequenciaPodologo;
    }

    public boolean isFazUsoDeMedicamento() {
        return fazUsoDeMedicamento;
    }

    public void setFazUsoDeMedicamento(boolean fazUsoDeMedicamento) {
        this.fazUsoDeMedicamento = fazUsoDeMedicamento;
    }

    public String getQualMedicamento() {
        return qualMedicamento;
    }

    public void setQualMedicamento(String qualMedicamento) {
        this.qualMedicamento = qualMedicamento;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public String getSubstanciasAlergicas() {
        return substanciasAlergicas;
    }

    public void setSubstanciasAlergicas(String substanciasAlergicas) {
        this.substanciasAlergicas = substanciasAlergicas;
    }

    public String getPosicaoTrabalho() {
        return posicaoTrabalho;
    }

    public void setPosicaoTrabalho(String posicaoTrabalho) {
        this.posicaoTrabalho = posicaoTrabalho;
    }

    public boolean isFazUsoDePalmilha() {
        return fazUsoDePalmilha;
    }

    public void setFazUsoDePalmilha(boolean fazUsoDePalmilha) {
        this.fazUsoDePalmilha = fazUsoDePalmilha;
    }

    public String getTipoPalmilha() {
        return tipoPalmilha;
    }

    public void setTipoPalmilha(String tipoPalmilha) {
        this.tipoPalmilha = tipoPalmilha;
    }

    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public boolean isGestante() {
        return gestante;
    }

    public void setGestante(boolean gestante) {
        this.gestante = gestante;
    }

    public boolean isAmamentando() {
        return amamentando;
    }

    public void setAmamentando(boolean amamentando) {
        this.amamentando = amamentando;
    }

    public boolean isPraticaAtividadeFisica() {
        return praticaAtividadeFisica;
    }

    public void setPraticaAtividadeFisica(boolean praticaAtividadeFisica) {
        this.praticaAtividadeFisica = praticaAtividadeFisica;
    }

    public String getFrequenciaAtividadeFisica() {
        return frequenciaAtividadeFisica;
    }

    public void setFrequenciaAtividadeFisica(String frequenciaAtividadeFisica) {
        this.frequenciaAtividadeFisica = frequenciaAtividadeFisica;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public String getTipoDeCalcadoEsporte() {
        return tipoDeCalcadoEsporte;
    }

    public void setTipoDeCalcadoEsporte(String tipoDeCalcadoEsporte) {
        this.tipoDeCalcadoEsporte = tipoDeCalcadoEsporte;
    }

    public String getTipoDeCalcadoDiario() {
        return tipoDeCalcadoDiario;
    }

    public void setTipoDeCalcadoDiario(String tipoDeCalcadoDiario) {
        this.tipoDeCalcadoDiario = tipoDeCalcadoDiario;
    }

    public boolean isGestanteClinico() {
        return gestanteClinico;
    }

    public void setGestanteClinico(boolean gestanteClinico) {
        this.gestanteClinico = gestanteClinico;
    }

    public boolean isHipertiroidismo() {
        return hipertiroidismo;
    }

    public void setHipertiroidismo(boolean hipertiroidismo) {
        this.hipertiroidismo = hipertiroidismo;
    }

    public boolean isRenais() {
        return renais;
    }

    public void setRenais(boolean renais) {
        this.renais = renais;
    }

    public boolean isQuimioterapiaRadioterapia() {
        return quimioterapiaRadioterapia;
    }

    public void setQuimioterapiaRadioterapia(boolean quimioterapiaRadioterapia) {
        this.quimioterapiaRadioterapia = quimioterapiaRadioterapia;
    }

    public boolean isOsteoporose() {
        return osteoporose;
    }

    public void setOsteoporose(boolean osteoporose) {
        this.osteoporose = osteoporose;
    }

    public boolean isHipotiroidismo() {
        return hipotiroidismo;
    }

    public void setHipotiroidismo(boolean hipotiroidismo) {
        this.hipotiroidismo = hipotiroidismo;
    }

    public boolean isNeuropatia() {
        return neuropatia;
    }

    public void setNeuropatia(boolean neuropatia) {
        this.neuropatia = neuropatia;
    }

    public boolean isAntecedentesOncologicos() {
        return antecedentesOncologicos;
    }

    public void setAntecedentesOncologicos(boolean antecedentesOncologicos) {
        this.antecedentesOncologicos = antecedentesOncologicos;
    }

    public boolean isCardiopatia() {
        return cardiopatia;
    }

    public void setCardiopatia(boolean cardiopatia) {
        this.cardiopatia = cardiopatia;
    }

    public boolean isHipertensao() {
        return hipertensao;
    }

    public void setHipertensao(boolean hipertensao) {
        this.hipertensao = hipertensao;
    }

    public boolean isReumatismo() {
        return reumatismo;
    }

    public void setReumatismo(boolean reumatismo) {
        this.reumatismo = reumatismo;
    }

    public boolean isCirurgiaMMII() {
        return cirurgiaMMII;
    }

    public void setCirurgiaMMII(boolean cirurgiaMMII) {
        this.cirurgiaMMII = cirurgiaMMII;
    }

    public boolean isMarcaPasso() {
        return marcaPasso;
    }

    public void setMarcaPasso(boolean marcaPasso) {
        this.marcaPasso = marcaPasso;
    }

    public boolean isHipotensao() {
        return hipotensao;
    }

    public void setHipotensao(boolean hipotensao) {
        this.hipotensao = hipotensao;
    }

    public boolean isAlteracoesVasculares() {
        return alteracoesVasculares;
    }

    public void setAlteracoesVasculares(boolean alteracoesVasculares) {
        this.alteracoesVasculares = alteracoesVasculares;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public String getTaxaGlicemia() {
        return taxaGlicemia;
    }

    public void setTaxaGlicemia(String taxaGlicemia) {
        this.taxaGlicemia = taxaGlicemia;
    }

    public LocalDate getDataUltimaVerificacaoGlicemia() {
        return dataUltimaVerificacaoGlicemia;
    }

    public void setDataUltimaVerificacaoGlicemia(LocalDate dataUltimaVerificacaoGlicemia) {
        this.dataUltimaVerificacaoGlicemia = dataUltimaVerificacaoGlicemia;
    }

    public boolean isFazUsoDeInsulina() {
        return fazUsoDeInsulina;
    }

    public void setFazUsoDeInsulina(boolean fazUsoDeInsulina) {
        this.fazUsoDeInsulina = fazUsoDeInsulina;
    }

    public boolean isDietaHidrica() {
        return dietaHidrica;
    }

    public void setDietaHidrica(boolean dietaHidrica) {
        this.dietaHidrica = dietaHidrica;
    }

    public boolean isDietaAlimentar() {
        return dietaAlimentar;
    }

    public void setDietaAlimentar(boolean dietaAlimentar) {
        this.dietaAlimentar = dietaAlimentar;
    }

    public boolean isCavoSupinado() {
        return cavoSupinado;
    }

    public void setCavoSupinado(boolean cavoSupinado) {
        this.cavoSupinado = cavoSupinado;
    }

    public boolean isNormalNeutro() {
        return normalNeutro;
    }

    public void setNormalNeutro(boolean normalNeutro) {
        this.normalNeutro = normalNeutro;
    }

    public boolean isPlanoPronado() {
        return planoPronado;
    }

    public void setPlanoPronado(boolean planoPronado) {
        this.planoPronado = planoPronado;
    }

    public boolean isBromidrose() {
        return bromidrose;
    }

    public void setBromidrose(boolean bromidrose) {
        this.bromidrose = bromidrose;
    }

    public boolean isIsquemia() {
        return isquemia;
    }

    public void setIsquemia(boolean isquemia) {
        this.isquemia = isquemia;
    }

    public boolean isCaloComNucleo() {
        return caloComNucleo;
    }

    public void setCaloComNucleo(boolean caloComNucleo) {
        this.caloComNucleo = caloComNucleo;
    }

    public boolean isCalo() {
        return calo;
    }

    public void setCalo(boolean calo) {
        this.calo = calo;
    }

    public boolean isHidrose() {
        return hidrose;
    }

    public void setHidrose(boolean hidrose) {
        this.hidrose = hidrose;
    }

    public boolean isMalPerfurante() {
        return malPerfurante;
    }

    public void setMalPerfurante(boolean malPerfurante) {
        this.malPerfurante = malPerfurante;
    }

    public boolean isPsoriase() {
        return psoriase;
    }

    public void setPsoriase(boolean psoriase) {
        this.psoriase = psoriase;
    }

    public boolean isVerrugaPlantar() {
        return verrugaPlantar;
    }

    public void setVerrugaPlantar(boolean verrugaPlantar) {
        this.verrugaPlantar = verrugaPlantar;
    }

    public boolean isDedoseDisedrose() {
        return dedoseDisedrose;
    }

    public void setDedoseDisedrose(boolean dedoseDisedrose) {
        this.dedoseDisedrose = dedoseDisedrose;
    }

    public boolean isEdema() {
        return edema;
    }

    public void setEdema(boolean edema) {
        this.edema = edema;
    }

    public boolean isTungiase() {
        return tungiase;
    }

    public void setTungiase(boolean tungiase) {
        this.tungiase = tungiase;
    }

    public boolean isCalosidade() {
        return calosidade;
    }

    public void setCalosidade(boolean calosidade) {
        this.calosidade = calosidade;
    }

    public boolean isTinea() {
        return tinea;
    }

    public void setTinea(boolean tinea) {
        this.tinea = tinea;
    }

    public boolean isFissuras() {
        return fissuras;
    }

    public void setFissuras(boolean fissuras) {
        this.fissuras = fissuras;
    }

    public boolean isDedosRigidos() {
        return dedosRigidos;
    }

    public void setDedosRigidos(boolean dedosRigidos) {
        this.dedosRigidos = dedosRigidos;
    }

    public boolean isDedosEspalmados() {
        return dedosEspalmados;
    }

    public void setDedosEspalmados(boolean dedosEspalmados) {
        this.dedosEspalmados = dedosEspalmados;
    }

    public boolean isMartelo() {
        return martelo;
    }

    public void setMartelo(boolean martelo) {
        this.martelo = martelo;
    }

    public boolean isQuedaDeMetatarso() {
        return quedaDeMetatarso;
    }

    public void setQuedaDeMetatarso(boolean quedaDeMetatarso) {
        this.quedaDeMetatarso = quedaDeMetatarso;
    }

    public boolean isOnicoatrofia() {
        return onicoatrofia;
    }

    public void setOnicoatrofia(boolean onicoatrofia) {
        this.onicoatrofia = onicoatrofia;
    }

    public boolean isOnicorrexe() {
        return onicorrexe;
    }

    public void setOnicorrexe(boolean onicorrexe) {
        this.onicorrexe = onicorrexe;
    }

    public boolean isOnicogrifose() {
        return onicogrifose;
    }

    public void setOnicogrifose(boolean onicogrifose) {
        this.onicogrifose = onicogrifose;
    }

    public boolean isOnicrocriptose() {
        return onicrocriptose;
    }

    public void setOnicrocriptose(boolean onicrocriptose) {
        this.onicrocriptose = onicrocriptose;
    }

    public boolean isGranuloma() {
        return granuloma;
    }

    public void setGranuloma(boolean granuloma) {
        this.granuloma = granuloma;
    }

    public boolean isOnicolise() {
        return onicolise;
    }

    public void setOnicolise(boolean onicolise) {
        this.onicolise = onicolise;
    }

    public boolean isOnicofose() {
        return onicofose;
    }

    public void setOnicofose(boolean onicofose) {
        this.onicofose = onicofose;
    }

    public boolean isOnicomicose() {
        return onicomicose;
    }

    public void setOnicomicose(boolean onicomicose) {
        this.onicomicose = onicomicose;
    }

    public boolean isPsoriaseUngueal() {
        return psoriaseUngueal;
    }

    public void setPsoriaseUngueal(boolean psoriaseUngueal) {
        this.psoriaseUngueal = psoriaseUngueal;
    }

    public String getPerfusao() {
        return perfusao;
    }

    public void setPerfusao(String perfusao) {
        this.perfusao = perfusao;
    }

    public String getOutrasAlteracoes() {
        return outrasAlteracoes;
    }

    public void setOutrasAlteracoes(String outrasAlteracoes) {
        this.outrasAlteracoes = outrasAlteracoes;
    }

    public String getRgPaciente() {
        return rgPaciente;
    }

    public void setRgPaciente(String rgPaciente) {
        this.rgPaciente = rgPaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getAssinaturaPaciente() {
        return assinaturaPaciente;
    }

    public void setAssinaturaPaciente(String assinaturaPaciente) {
        this.assinaturaPaciente = assinaturaPaciente;
    }

    private String cep;
    private LocalDate dataNascimento;
    private String sexo; // Masculino ou Feminino
    private String profissao;
    private String numeroContato;

    /* Dados Gerais */
    private String queixaPrincipal;
    private boolean costumaIrAoPodologo;
    private String frequenciaPodologo;
    private boolean fazUsoDeMedicamento;
    private String qualMedicamento;
    private boolean alergico;
    private String substanciasAlergicas;
    private String posicaoTrabalho; // Em pé, Sentado ou Andando
    private boolean fazUsoDePalmilha;
    private String tipoPalmilha; // Ortopédica ou Descanso
    private boolean fumante;
    private boolean gestante;
    private boolean amamentando;
    private boolean praticaAtividadeFisica;
    private String frequenciaAtividadeFisica;
    private String esporte;
    private String tipoDeCalcadoEsporte;
    private String tipoDeCalcadoDiario;

    /* Dados Clínicos */
    private boolean gestanteClinico;
    private boolean hipertiroidismo;
    private boolean renais;
    private boolean quimioterapiaRadioterapia;
    private boolean osteoporose;
    private boolean hipotiroidismo;
    private boolean neuropatia;
    private boolean antecedentesOncologicos;
    private boolean cardiopatia;
    private boolean hipertensao;
    private boolean reumatismo;
    private boolean cirurgiaMMII;
    private boolean marcaPasso;
    private boolean hipotensao;
    private boolean alteracoesVasculares;
    private boolean diabetes;
    private String taxaGlicemia;
    private LocalDate dataUltimaVerificacaoGlicemia;
    private boolean fazUsoDeInsulina;
    private boolean dietaHidrica;
    private boolean dietaAlimentar;

    /* Alterações e Lesões dos Pés */
    private boolean cavoSupinado;
    private boolean normalNeutro;
    private boolean planoPronado;
    private boolean bromidrose;
    private boolean isquemia;
    private boolean caloComNucleo;
    private boolean calo;
    private boolean hidrose;
    private boolean malPerfurante;
    private boolean psoriase;
    private boolean verrugaPlantar;
    private boolean dedoseDisedrose;
    private boolean edema;
    private boolean tungiase;
    private boolean calosidade;
    private boolean tinea;
    private boolean fissuras;
    private boolean dedosRigidos;
    private boolean dedosEspalmados;
    private boolean martelo;
    private boolean quedaDeMetatarso;

    /* Perfusão */
    private boolean onicoatrofia;
    private boolean onicorrexe;
    private boolean onicogrifose;
    private boolean onicrocriptose;
    private boolean granuloma;
    private boolean onicolise;
    private boolean onicofose;
    private boolean onicomicose;
    private boolean psoriaseUngueal;
    private String perfusao; // Normal, Pálido ou Cianótico
    private String outrasAlteracoes;

    /* Termo de Responsabilidade */
    private String rgPaciente;
    private String cpfPaciente;
    private String assinaturaPaciente;

    // Getters e Setters...
}