/**
 * Copyright (c) 2024 CEA LIST.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 */
package fr.cea.deeplab.projectmgmt.impl;

import fr.cea.deeplab.projectmgmt.Person;
import fr.cea.deeplab.projectmgmt.ProjectmgmtPackage;
import fr.cea.deeplab.projectmgmt.WorkpackageArtefact;
import fr.cea.deeplab.projectmgmt.WorkpackageArtefactNature;

import java.time.LocalDate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Workpackage Artefact</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.WorkpackageArtefactImpl#getName <em>Name</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.WorkpackageArtefactImpl#getDescription <em>Description</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.WorkpackageArtefactImpl#getNature <em>Nature</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.WorkpackageArtefactImpl#getPlannedDeadline <em>Planned Deadline</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.WorkpackageArtefactImpl#getEffectiveDeadLine <em>Effective Dead
 * Line</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.WorkpackageArtefactImpl#getIsInvoiceTrigger <em>Is Invoice
 * Trigger</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.WorkpackageArtefactImpl#getInvoiceAmount <em>Invoice Amount</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.WorkpackageArtefactImpl#getResponsible <em>Responsible</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.WorkpackageArtefactImpl#getVersion <em>Version</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.WorkpackageArtefactImpl#getIsObsolete <em>Is Obsolete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkpackageArtefactImpl extends MinimalEObjectImpl.Container implements WorkpackageArtefact {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getNature() <em>Nature</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getNature()
     * @generated NOT
     * @ordered
     */
    protected static final WorkpackageArtefactNature NATURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getNature()
     * @generated
     * @ordered
     */
    protected WorkpackageArtefactNature nature = NATURE_EDEFAULT;

    /**
     * The default value of the '{@link #getPlannedDeadline() <em>Planned Deadline</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getPlannedDeadline()
     * @generated
     * @ordered
     */
    protected static final LocalDate PLANNED_DEADLINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlannedDeadline() <em>Planned Deadline</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getPlannedDeadline()
     * @generated
     * @ordered
     */
    protected LocalDate plannedDeadline = PLANNED_DEADLINE_EDEFAULT;

    /**
     * The default value of the '{@link #getEffectiveDeadLine() <em>Effective Dead Line</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEffectiveDeadLine()
     * @generated
     * @ordered
     */
    protected static final LocalDate EFFECTIVE_DEAD_LINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEffectiveDeadLine() <em>Effective Dead Line</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEffectiveDeadLine()
     * @generated
     * @ordered
     */
    protected LocalDate effectiveDeadLine = EFFECTIVE_DEAD_LINE_EDEFAULT;

    /**
     * The default value of the '{@link #getIsInvoiceTrigger() <em>Is Invoice Trigger</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIsInvoiceTrigger()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_INVOICE_TRIGGER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsInvoiceTrigger() <em>Is Invoice Trigger</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIsInvoiceTrigger()
     * @generated
     * @ordered
     */
    protected Boolean isInvoiceTrigger = IS_INVOICE_TRIGGER_EDEFAULT;

    /**
     * The default value of the '{@link #getInvoiceAmount() <em>Invoice Amount</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getInvoiceAmount()
     * @generated
     * @ordered
     */
    protected static final Integer INVOICE_AMOUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInvoiceAmount() <em>Invoice Amount</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getInvoiceAmount()
     * @generated
     * @ordered
     */
    protected Integer invoiceAmount = INVOICE_AMOUNT_EDEFAULT;

    /**
     * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getResponsible()
     * @generated
     * @ordered
     */
    protected Person responsible;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getIsObsolete() <em>Is Obsolete</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getIsObsolete()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_OBSOLETE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsObsolete() <em>Is Obsolete</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getIsObsolete()
     * @generated
     * @ordered
     */
    protected Boolean isObsolete = IS_OBSOLETE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected WorkpackageArtefactImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProjectmgmtPackage.Literals.WORKPACKAGE_ARTEFACT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = this.name;
        this.name = newName;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__NAME, oldName, this.name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescription(String newDescription) {
        String oldDescription = this.description;
        this.description = newDescription;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__DESCRIPTION, oldDescription, this.description));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public WorkpackageArtefactNature getNature() {
        return this.nature;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setNature(WorkpackageArtefactNature newNature) {
        WorkpackageArtefactNature oldNature = this.nature;
        this.nature = newNature == null ? NATURE_EDEFAULT : newNature;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__NATURE, oldNature, this.nature));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LocalDate getPlannedDeadline() {
        return this.plannedDeadline;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPlannedDeadline(LocalDate newPlannedDeadline) {
        LocalDate oldPlannedDeadline = this.plannedDeadline;
        this.plannedDeadline = newPlannedDeadline;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__PLANNED_DEADLINE, oldPlannedDeadline, this.plannedDeadline));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LocalDate getEffectiveDeadLine() {
        return this.effectiveDeadLine;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEffectiveDeadLine(LocalDate newEffectiveDeadLine) {
        LocalDate oldEffectiveDeadLine = this.effectiveDeadLine;
        this.effectiveDeadLine = newEffectiveDeadLine;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__EFFECTIVE_DEAD_LINE, oldEffectiveDeadLine, this.effectiveDeadLine));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Boolean getIsInvoiceTrigger() {
        return this.isInvoiceTrigger;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIsInvoiceTrigger(Boolean newIsInvoiceTrigger) {
        Boolean oldIsInvoiceTrigger = this.isInvoiceTrigger;
        this.isInvoiceTrigger = newIsInvoiceTrigger;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__IS_INVOICE_TRIGGER, oldIsInvoiceTrigger, this.isInvoiceTrigger));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Integer getInvoiceAmount() {
        return this.invoiceAmount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInvoiceAmount(Integer newInvoiceAmount) {
        Integer oldInvoiceAmount = this.invoiceAmount;
        this.invoiceAmount = newInvoiceAmount;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__INVOICE_AMOUNT, oldInvoiceAmount, this.invoiceAmount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Person getResponsible() {
        if (this.responsible != null && this.responsible.eIsProxy()) {
            InternalEObject oldResponsible = (InternalEObject) this.responsible;
            this.responsible = (Person) this.eResolveProxy(oldResponsible);
            if (this.responsible != oldResponsible) {
                if (this.eNotificationRequired())
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__RESPONSIBLE, oldResponsible, this.responsible));
            }
        }
        return this.responsible;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Person basicGetResponsible() {
        return this.responsible;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResponsible(Person newResponsible) {
        Person oldResponsible = this.responsible;
        this.responsible = newResponsible;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__RESPONSIBLE, oldResponsible, this.responsible));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setVersion(String newVersion) {
        String oldVersion = this.version;
        this.version = newVersion;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__VERSION, oldVersion, this.version));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Boolean getIsObsolete() {
        return this.isObsolete;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIsObsolete(Boolean newIsObsolete) {
        Boolean oldIsObsolete = this.isObsolete;
        this.isObsolete = newIsObsolete;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__IS_OBSOLETE, oldIsObsolete, this.isObsolete));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__NAME:
                return this.getName();
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__DESCRIPTION:
                return this.getDescription();
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__NATURE:
                return this.getNature();
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__PLANNED_DEADLINE:
                return this.getPlannedDeadline();
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__EFFECTIVE_DEAD_LINE:
                return this.getEffectiveDeadLine();
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__IS_INVOICE_TRIGGER:
                return this.getIsInvoiceTrigger();
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__INVOICE_AMOUNT:
                return this.getInvoiceAmount();
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__RESPONSIBLE:
                if (resolve)
                    return this.getResponsible();
                return this.basicGetResponsible();
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__VERSION:
                return this.getVersion();
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__IS_OBSOLETE:
                return this.getIsObsolete();
            default:
                return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__NAME:
                this.setName((String) newValue);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__DESCRIPTION:
                this.setDescription((String) newValue);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__NATURE:
                this.setNature((WorkpackageArtefactNature) newValue);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__PLANNED_DEADLINE:
                this.setPlannedDeadline((LocalDate) newValue);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__EFFECTIVE_DEAD_LINE:
                this.setEffectiveDeadLine((LocalDate) newValue);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__IS_INVOICE_TRIGGER:
                this.setIsInvoiceTrigger((Boolean) newValue);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__INVOICE_AMOUNT:
                this.setInvoiceAmount((Integer) newValue);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__RESPONSIBLE:
                this.setResponsible((Person) newValue);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__VERSION:
                this.setVersion((String) newValue);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__IS_OBSOLETE:
                this.setIsObsolete((Boolean) newValue);
                return;
            default:
                super.eSet(featureID, newValue);
                return;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__NAME:
                this.setName(NAME_EDEFAULT);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__DESCRIPTION:
                this.setDescription(DESCRIPTION_EDEFAULT);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__NATURE:
                this.setNature(NATURE_EDEFAULT);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__PLANNED_DEADLINE:
                this.setPlannedDeadline(PLANNED_DEADLINE_EDEFAULT);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__EFFECTIVE_DEAD_LINE:
                this.setEffectiveDeadLine(EFFECTIVE_DEAD_LINE_EDEFAULT);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__IS_INVOICE_TRIGGER:
                this.setIsInvoiceTrigger(IS_INVOICE_TRIGGER_EDEFAULT);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__INVOICE_AMOUNT:
                this.setInvoiceAmount(INVOICE_AMOUNT_EDEFAULT);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__RESPONSIBLE:
                this.setResponsible((Person) null);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__VERSION:
                this.setVersion(VERSION_EDEFAULT);
                return;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__IS_OBSOLETE:
                this.setIsObsolete(IS_OBSOLETE_EDEFAULT);
                return;
            default:
                super.eUnset(featureID);
                return;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__NAME:
                return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? this.description != null : !DESCRIPTION_EDEFAULT.equals(this.description);
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__NATURE:
                return this.nature != NATURE_EDEFAULT;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__PLANNED_DEADLINE:
                return PLANNED_DEADLINE_EDEFAULT == null ? this.plannedDeadline != null : !PLANNED_DEADLINE_EDEFAULT.equals(this.plannedDeadline);
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__EFFECTIVE_DEAD_LINE:
                return EFFECTIVE_DEAD_LINE_EDEFAULT == null ? this.effectiveDeadLine != null : !EFFECTIVE_DEAD_LINE_EDEFAULT.equals(this.effectiveDeadLine);
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__IS_INVOICE_TRIGGER:
                return IS_INVOICE_TRIGGER_EDEFAULT == null ? this.isInvoiceTrigger != null : !IS_INVOICE_TRIGGER_EDEFAULT.equals(this.isInvoiceTrigger);
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__INVOICE_AMOUNT:
                return INVOICE_AMOUNT_EDEFAULT == null ? this.invoiceAmount != null : !INVOICE_AMOUNT_EDEFAULT.equals(this.invoiceAmount);
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__RESPONSIBLE:
                return this.responsible != null;
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__VERSION:
                return VERSION_EDEFAULT == null ? this.version != null : !VERSION_EDEFAULT.equals(this.version);
            case ProjectmgmtPackage.WORKPACKAGE_ARTEFACT__IS_OBSOLETE:
                return IS_OBSOLETE_EDEFAULT == null ? this.isObsolete != null : !IS_OBSOLETE_EDEFAULT.equals(this.isObsolete);
            default:
                return super.eIsSet(featureID);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(this.name);
        result.append(", description: ");
        result.append(this.description);
        result.append(", nature: ");
        result.append(this.nature);
        result.append(", plannedDeadline: ");
        result.append(this.plannedDeadline);
        result.append(", effectiveDeadLine: ");
        result.append(this.effectiveDeadLine);
        result.append(", isInvoiceTrigger: ");
        result.append(this.isInvoiceTrigger);
        result.append(", invoiceAmount: ");
        result.append(this.invoiceAmount);
        result.append(", version: ");
        result.append(this.version);
        result.append(", isObsolete: ");
        result.append(this.isObsolete);
        result.append(')');
        return result.toString();
    }

} // WorkpackageArtefactImpl
