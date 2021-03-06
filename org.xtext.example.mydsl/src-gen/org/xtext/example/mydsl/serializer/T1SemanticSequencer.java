/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl.services.T1GrammarAccess;
import org.xtext.example.mydsl.t1.Model;
import org.xtext.example.mydsl.t1.T1Package;
import org.xtext.example.mydsl.t1.Var;

@SuppressWarnings("all")
public class T1SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private T1GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == T1Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case T1Package.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case T1Package.VAR:
				sequence_Var(context, (Var) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     vars+=Var+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Var returns Var
	 *
	 * Constraint:
	 *     (declarations+=Declaration declarations+=Declaration*)
	 */
	protected void sequence_Var(ISerializationContext context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
