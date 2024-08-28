import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees['bonus'] = employees['salary']*2
    return employees

def createBonusColumn_2(employees: pd.DataFrame) -> pd.DataFrame:
    employees['bonus'] = employees['salary'].apply(lambda x: x*2)
    return employees