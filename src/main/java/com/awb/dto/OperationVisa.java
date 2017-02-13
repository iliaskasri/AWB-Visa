package com.awb.dto;

import java.math.BigDecimal;
import java.sql.Date;

public class OperationVisa {
	/** 
	* 
	*/
	private static final long serialVersionUID = -1922548913814573921L;

	private Long id;

	/**
	 * date passation DATE_PASSATION;date passation;
	 */
	private Date datePassation;
	/**
	 * Type operation
	 */
	private String typeOperation;
	/**
	 * flag controle depassement FLAG_CONTROLE_DEPASSEMENT;flag controle
	 * depassement;1;
	 */
	private Boolean flagControleDepassement;
	/**
	 * Operation rejetee FLAG_OPERATION_REJETEE;flag operation rejetee;1;
	 */
	private Boolean flagOperationRejetee;
	/**
	 * identifiant operation IDENTIFIANT_OPERATION;identifiant
	 * operation;\d{1,10};
	 */
	private Integer identifiantOperation;
	/**
	 * identifiant operation mere IDENTIFIANT_OPERATION_MERE;identifiant
	 * operation mere;\d{1,10};
	 */
	private Integer identifiantOperationMere;
	/**
	 * libelle operation LIBELLE_OPERATION;libelle operation;30;
	 */
	private String libelleOperation;
	/**
	 * montant operation MONTANT_OPERATION;montant
	 * operation;\d{1,15}(\,|\.)\d{1,2};
	 */
	private BigDecimal montantOperation;
	/**
	 * montant vise MONTANT_VISE;montant vise;\d{1,15}(\,|\.)\d{1,2};0.00
	 */
	private BigDecimal montantVise;
	/**
	 * motif attente MOTIF_ATTENTE;motif attente;20;
	 */
	private String motifAttente;
	/**
	 * motif rejet MOTIF_REJET;motif rejet;30;
	 */
	private String motifRejet;
	/**
	 * numero fa NUMERO_FA;numero fa;\d{1,4};
	 */
	private Integer numeroFa;
	/**
	 * pv cro operation fa PV_CRO_OPERATION_FA;pv cro operation fa;1600;
	 */
	private String pvCroOperationFa;
	/**
	 * sens caisse SENS_CAISSE;sens caisse;1;
	 */
	private String sensCaisse;
	/**
	 * time stamp fa TIME_STAMP_FA;time stamp fa;
	 */
	private Date timeStampFa;
	/**
	 * Numero Virement
	 */
	private Integer numeroVirement;
	/**
	 * Statut Virement
	 */
	private String statutVirement;

	private Operation refOperation;
	private Devise refDevise;
	private Utilisateur refUtilisateur;
	private Utilisateur refUtilisateurRejet;
	private Utilisateur refDestinataireVisa;
	private Utilisateur refUtilisateurVisa;
	private String numeroCompte;
	private Compte refCompte;
	private Utilisateur refUtilisateurCreation;
//	private IUniteOrganisationnelle refAgenceCreation;
	private BigDecimal depassement;
	private String codeDestinataire;

	private Long version;

	@Override
	public final String toString() {
		return String.valueOf(getIdentifiantOperation());
	}

	public String getCodeDestinataire() {
		return codeDestinataire;
	}

	public void setCodeDestinataire(String codeDestinataire) {
		this.codeDestinataire = codeDestinataire;
	}

	/**
	 * Methode qui retourne l' instance de la factory d'une entité
	 * 
	 * @returns L' entite Factory
	 */

	public final Long getId() {
		return this.id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final Date getDatePassation() {
		return this.datePassation;
	}

	public final void setDatePassation(Date datePassation) {
		this.datePassation = datePassation;
	}

	public final String getTypeOperation() {
		return this.typeOperation;
	}

	public final void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}

	public final Integer getIdentifiantOperation() {
		return this.identifiantOperation;
	}

	public final void setIdentifiantOperation(Integer identifiantOperation) {
		this.identifiantOperation = identifiantOperation;
	}

	public final Integer getIdentifiantOperationMere() {
		return this.identifiantOperationMere;
	}

	public final void setIdentifiantOperationMere(Integer identifiantOperationMere) {
		this.identifiantOperationMere = identifiantOperationMere;
	}

	public final String getLibelleOperation() {
		return this.libelleOperation;
	}

	public final void setLibelleOperation(String libelleOperation) {
		this.libelleOperation = libelleOperation;
	}

	public final BigDecimal getMontantOperation() {
		return this.montantOperation;
	}

	public final void setMontantOperation(BigDecimal montantOperation) {
		this.montantOperation = montantOperation;
	}

	public final BigDecimal getMontantVise() {
		return this.montantVise;
	}

	public final void setMontantVise(BigDecimal montantVise) {
		this.montantVise = montantVise;
	}

	public final String getMotifAttente() {
		return this.motifAttente;
	}

	public final void setMotifAttente(String motifAttente) {
		this.motifAttente = motifAttente;
	}

	public final String getMotifRejet() {
		return this.motifRejet;
	}

	public final void setMotifRejet(String motifRejet) {
		this.motifRejet = motifRejet;
	}

	public final Integer getNumeroFa() {
		return this.numeroFa;
	}

	public final void setNumeroFa(Integer numeroFa) {
		this.numeroFa = numeroFa;
	}

	public final String getPvCroOperationFa() {
		return this.pvCroOperationFa;
	}

	public final void setPvCroOperationFa(String pvCroOperationFa) {
		this.pvCroOperationFa = pvCroOperationFa;
	}

	public final String getSensCaisse() {
		return this.sensCaisse;
	}

	public final void setSensCaisse(String sensCaisse) {
		this.sensCaisse = sensCaisse;
	}

	public final Date getTimeStampFa() {
		return this.timeStampFa;
	}

	public final void setTimeStampFa(Date timeStampFa) {
		this.timeStampFa = timeStampFa;
	}

	public final Operation getRefOperation() {
		return this.refOperation;
	}

	public final void setRefOperation(Operation refOperation) {
		this.refOperation = refOperation;
	}

	public final Devise getRefDevise() {
		return this.refDevise;
	}

	public final void setRefDevise(Devise refDevise) {
		this.refDevise = refDevise;
	}

	public final Utilisateur getRefUtilisateur() {
		return this.refUtilisateur;
	}

	public final void setRefUtilisateur(Utilisateur refUtilisateur) {
		this.refUtilisateur = refUtilisateur;
	}

	public final Utilisateur getRefUtilisateurRejet() {
		return this.refUtilisateurRejet;
	}

	public final void setRefUtilisateurRejet(Utilisateur refUtilisateurRejet) {
		this.refUtilisateurRejet = refUtilisateurRejet;
	}

	public final Utilisateur getRefDestinataireVisa() {
		return this.refDestinataireVisa;
	}

	public final void setRefDestinataireVisa(Utilisateur refDestinataireVisa) {
		this.refDestinataireVisa = refDestinataireVisa;
	}

	public final Utilisateur getRefUtilisateurVisa() {
		return this.refUtilisateurVisa;
	}

	public final void setRefUtilisateurVisa(Utilisateur refUtilisateurVisa) {
		this.refUtilisateurVisa = refUtilisateurVisa;
	}

	public final Compte getRefCompte() {
		return this.refCompte;
	}

	public final void setRefCompte(Compte refCompte) {
		this.refCompte = refCompte;
	}

	public final Utilisateur getRefUtilisateurCreation() {
		return this.refUtilisateurCreation;
	}

	public final void setRefUtilisateurCreation(Utilisateur refUtilisateurCreation) {
		this.refUtilisateurCreation = refUtilisateurCreation;
	}

//	@Override
//	public final IUniteOrganisationnelle getRefAgenceCreation() {
//		return this.refAgenceCreation;
//	}
//
//	public final void setRefAgenceCreation(IUniteOrganisationnelle refAgenceCreation) {
//		this.refAgenceCreation = refAgenceCreation;
//	}

	/**
	 * Methode qui retourne l' Id du lockable
	 * 
	 * @returns id du locakble
	 */
	
	public final String getIdLockable() {
		return String.valueOf(getIdentifiantOperation());
	}

	/**
	 * Methode qui retourne le type du lockable
	 * 
	 * @returns type du locakble
	 */
	
	public final String getLockableType() {
		return this.getClass().getName();
	}

	
	public final String getIdAttribute() {
		return "identifiantOperation";
	}

	
	public final Object getIdAttributeValue() {
		return getIdentifiantOperation();
	}

	public final BigDecimal getDepassement() {
		return depassement;
	}

	public final void setDepassement(BigDecimal depassement) {
		this.depassement = depassement;
	}

	public final Boolean getFlagControleDepassement() {
		return flagControleDepassement;
	}

	public final void setFlagControleDepassement(Boolean flagControleDepassement) {
		this.flagControleDepassement = flagControleDepassement;
	}

	public final Boolean getFlagOperationRejetee() {
		return flagOperationRejetee;
	}

	public final void setFlagOperationRejetee(Boolean flagOperationRejetee) {
		this.flagOperationRejetee = flagOperationRejetee;
	}

	public Integer getNumeroVirement() {
		return numeroVirement;
	}

	public void setNumeroVirement(Integer numeroVirement) {
		this.numeroVirement = numeroVirement;
	}

	public String getStatutVirement() {
		return statutVirement;
	}

	public void setStatutVirement(String statutVirement) {
		this.statutVirement = statutVirement;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;

	}

	public OperationVisa(Long id, Date datePassation, String typeOperation, Boolean flagControleDepassement,
			Boolean flagOperationRejetee, Integer identifiantOperation, Integer identifiantOperationMere,
			String libelleOperation, BigDecimal montantOperation, BigDecimal montantVise, String motifAttente,
			String motifRejet, Integer numeroFa, String pvCroOperationFa, String sensCaisse, Date timeStampFa,
			Integer numeroVirement, String statutVirement, Operation refOperation, Devise refDevise,
			Utilisateur refUtilisateur, Utilisateur refUtilisateurRejet, Utilisateur refDestinataireVisa,
			Utilisateur refUtilisateurVisa, String numeroCompte, Compte refCompte, Utilisateur refUtilisateurCreation,
			BigDecimal depassement, String codeDestinataire, Long version) {
		super();
		this.id = id;
		this.datePassation = datePassation;
		this.typeOperation = typeOperation;
		this.flagControleDepassement = flagControleDepassement;
		this.flagOperationRejetee = flagOperationRejetee;
		this.identifiantOperation = identifiantOperation;
		this.identifiantOperationMere = identifiantOperationMere;
		this.libelleOperation = libelleOperation;
		this.montantOperation = montantOperation;
		this.montantVise = montantVise;
		this.motifAttente = motifAttente;
		this.motifRejet = motifRejet;
		this.numeroFa = numeroFa;
		this.pvCroOperationFa = pvCroOperationFa;
		this.sensCaisse = sensCaisse;
		this.timeStampFa = timeStampFa;
		this.numeroVirement = numeroVirement;
		this.statutVirement = statutVirement;
		this.refOperation = refOperation;
		this.refDevise = refDevise;
		this.refUtilisateur = refUtilisateur;
		this.refUtilisateurRejet = refUtilisateurRejet;
		this.refDestinataireVisa = refDestinataireVisa;
		this.refUtilisateurVisa = refUtilisateurVisa;
		this.numeroCompte = numeroCompte;
		this.refCompte = refCompte;
		this.refUtilisateurCreation = refUtilisateurCreation;
		this.depassement = depassement;
		this.codeDestinataire = codeDestinataire;
		this.version = version;
	}
	
	
}
