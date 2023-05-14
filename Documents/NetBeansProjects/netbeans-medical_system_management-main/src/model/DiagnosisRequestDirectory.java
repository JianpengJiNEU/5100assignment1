/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalsystem;

import java.util.HashMap;

/**
 *
 * @author Jianpeng Ji
 */
public class DiagnosisRequestDirectory {
    private HashMap<String, DiagnosisRequest> diagnosisRequestMap;

    public DiagnosisRequestDirectory() {
        this.diagnosisRequestMap = new HashMap<String, DiagnosisRequest>();
    }
    
    public void addDiagnosisRequest(DiagnosisRequest diagnosisRequest) {
        diagnosisRequestMap.put(diagnosisRequest.getId(), diagnosisRequest);
    }
    public void updateDiagnosisRequest(DiagnosisRequest diagnosisRequest){
        diagnosisRequestMap.remove(diagnosisRequest.getId());
        diagnosisRequestMap.put(diagnosisRequest.getId(), diagnosisRequest);
    }
    public void deleteDiagnosisRequest(DiagnosisRequest diagnosisRequest) {
        diagnosisRequestMap.remove(diagnosisRequest.getId());
    }
    public void deleteDiagnosisRequest(String diagnosisRequestId) {
        diagnosisRequestMap.remove(diagnosisRequestId);
    }

    public HashMap<String, DiagnosisRequest> getDiagnosisRequestMap() {
        return diagnosisRequestMap;
    }

    public void setDiagnosisRequestMap(HashMap<String, DiagnosisRequest> diagnosisRequestDirectory) {
        this.diagnosisRequestMap = diagnosisRequestDirectory;
    }

    
}
