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

import fr.cea.deeplab.projectmgmt.Dependency;
import fr.cea.deeplab.projectmgmt.DependencyLink;
import fr.cea.deeplab.projectmgmt.ProjectmgmtPackage;
import fr.cea.deeplab.projectmgmt.StartOrEnd;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Dependency Link</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.DependencyLinkImpl#getTarget <em>Target</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.DependencyLinkImpl#getSource <em>Source</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.DependencyLinkImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyLinkImpl extends MinimalEObjectImpl.Container implements DependencyLink {
    /**
     * The default value of the '{@link #getTarget() <em>Target</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected static final StartOrEnd TARGET_EDEFAULT = StartOrEnd.START;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected StartOrEnd target = TARGET_EDEFAULT;

    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final StartOrEnd SOURCE_EDEFAULT = StartOrEnd.END;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected StartOrEnd source = SOURCE_EDEFAULT;

    /**
     * The cached value of the '{@link #getDependency() <em>Dependency</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getDependency()
     * @generated
     * @ordered
     */
    protected Dependency dependency;

    /**
     * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected static final int DURATION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected int duration = DURATION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DependencyLinkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProjectmgmtPackage.Literals.DEPENDENCY_LINK;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StartOrEnd getTarget() {
        return this.target;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTarget(StartOrEnd newTarget) {
        StartOrEnd oldTarget = this.target;
        this.target = newTarget == null ? TARGET_EDEFAULT : newTarget;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.DEPENDENCY_LINK__TARGET, oldTarget, this.target));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StartOrEnd getSource() {
        return this.source;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSource(StartOrEnd newSource) {
        StartOrEnd oldSource = this.source;
        this.source = newSource == null ? SOURCE_EDEFAULT : newSource;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.DEPENDENCY_LINK__SOURCE, oldSource, this.source));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Dependency getDependency() {
        if (this.dependency != null && this.dependency.eIsProxy()) {
            InternalEObject oldDependency = (InternalEObject) this.dependency;
            this.dependency = (Dependency) this.eResolveProxy(oldDependency);
            if (this.dependency != oldDependency) {
                if (this.eNotificationRequired())
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectmgmtPackage.DEPENDENCY_LINK__DEPENDENCY, oldDependency, this.dependency));
            }
        }
        return this.dependency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Dependency basicGetDependency() {
        return this.dependency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDependency(Dependency newDependency) {
        Dependency oldDependency = this.dependency;
        this.dependency = newDependency;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.DEPENDENCY_LINK__DEPENDENCY, oldDependency, this.dependency));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getDuration() {
        return this.duration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDuration(int newDuration) {
        int oldDuration = this.duration;
        this.duration = newDuration;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProjectmgmtPackage.DEPENDENCY_LINK__DURATION, oldDuration, this.duration));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ProjectmgmtPackage.DEPENDENCY_LINK__TARGET:
                return this.getTarget();
            case ProjectmgmtPackage.DEPENDENCY_LINK__SOURCE:
                return this.getSource();
            case ProjectmgmtPackage.DEPENDENCY_LINK__DEPENDENCY:
                if (resolve)
                    return this.getDependency();
                return this.basicGetDependency();
            case ProjectmgmtPackage.DEPENDENCY_LINK__DURATION:
                return this.getDuration();
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
            case ProjectmgmtPackage.DEPENDENCY_LINK__TARGET:
                this.setTarget((StartOrEnd) newValue);
                return;
            case ProjectmgmtPackage.DEPENDENCY_LINK__SOURCE:
                this.setSource((StartOrEnd) newValue);
                return;
            case ProjectmgmtPackage.DEPENDENCY_LINK__DEPENDENCY:
                this.setDependency((Dependency) newValue);
                return;
            case ProjectmgmtPackage.DEPENDENCY_LINK__DURATION:
                this.setDuration((Integer) newValue);
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
            case ProjectmgmtPackage.DEPENDENCY_LINK__TARGET:
                this.setTarget(TARGET_EDEFAULT);
                return;
            case ProjectmgmtPackage.DEPENDENCY_LINK__SOURCE:
                this.setSource(SOURCE_EDEFAULT);
                return;
            case ProjectmgmtPackage.DEPENDENCY_LINK__DEPENDENCY:
                this.setDependency((Dependency) null);
                return;
            case ProjectmgmtPackage.DEPENDENCY_LINK__DURATION:
                this.setDuration(DURATION_EDEFAULT);
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
            case ProjectmgmtPackage.DEPENDENCY_LINK__TARGET:
                return this.target != TARGET_EDEFAULT;
            case ProjectmgmtPackage.DEPENDENCY_LINK__SOURCE:
                return this.source != SOURCE_EDEFAULT;
            case ProjectmgmtPackage.DEPENDENCY_LINK__DEPENDENCY:
                return this.dependency != null;
            case ProjectmgmtPackage.DEPENDENCY_LINK__DURATION:
                return this.duration != DURATION_EDEFAULT;
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
        result.append(" (target: ");
        result.append(this.target);
        result.append(", source: ");
        result.append(this.source);
        result.append(", duration: ");
        result.append(this.duration);
        result.append(')');
        return result.toString();
    }

} // DependencyLinkImpl
